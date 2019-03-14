package com.lb.server.design.wpandcl;

import java.util.ArrayList;
import java.util.List;

/**
 * 默认实现
 *
 * @author LiBin
 * @email libin@ellabook.cn
 * @create 2018-08-07 15:28
 **/
public abstract class AbstractEnTest implements EnTest {

    //@Transactional(rollbackFor = Exception.class)
    @Override
    public List<Object> getTestList(Object request) {
        List<Object> result = new ArrayList<>();
        //获取当前关卡
        //Mission mission = missionMapper.selectByPrimaryKey(request.getId());
        //if (null == mission) {
        //    return result;
        //}
        long missionId = 0L;
        //autoAcquireForFreeMission(request, mission);

        //获取题目列表(子类实现)
        List<Object> resQuestionList = getResQuestion(missionId);
        //if (CollectionUtils.isEmpty(resQuestionList)) {
        //    return result;
        //}
        //List<Long> questionIds = getQuestionIds(resQuestionList);
        ////组合返回数据
        //transformToEnTestDtoList(result, resQuestionList, getResQuestionItemList(questionIds));
        return result;
    }

    //@Transactional(rollbackFor = Exception.class)
    //@Override
    //public AnalysisTestInfoDto analysisTestAnswer(TestAnswerRequest request) {
    //    Mission mission = missionMapper.selectByPrimaryKey(request.getId());
    //    if (null == mission) {
    //        return new AnalysisTestInfoDto();
    //    }
    //    //答案解析(子类实现)
    //    AnalysisTestInfoDto result = doAnalysisTestAnswer(request, mission);
    //    if (result.getIsPass()) {
    //        result.setNextMissionInfo(missionTService.getJumpMissionInfo(mission.getId()));
    //        result.setGotStoneNum(getPassNum(request));
    //        UserMissionExample example = new UserMissionExample();
    //        example.createCriteria().andUidEqualTo(request.getUid()).andMissionCodeEqualTo(mission.getMissionCode());
    //        UserMission userMission = CollectionUtils.isEmpty(userMissionMapper.selectByExample(example)) ? null
    //                : userMissionMapper.selectByExample(example).get(0);
    //        if (null != userMission) {
    //            //通关后的设置
    //            afterCompletion(request, mission, userMission);
    //            userMapTService.updateUserMapWhenMissionFinish(userMission.getMapCode(), request.getUid(), userMission);
    //        }
    //    }
    //    //答题记录
    //    recordTestAnswer(request, mission);
    //    return result;
    //}
    //
    //@Override
    //public TestRecordDto getLastTimeQuestionRecord(GetEnTestListRequest request) {
    //    TestRecordDto result = new TestRecordDto();
    //    Mission mission = missionMapper.selectByPrimaryKey(request.getId());
    //    if (null == mission) {
    //        return result;
    //    }
    //    result.setPassNum(mission.getPassNum());
    //    QuestionRecord param = new QuestionRecord();
    //    param.setMessionId(mission.getMissionCode());
    //    param.setUserId(request.getUid());
    //    param.setExamType(request.getTestType().toUpperCase());
    //    param.setIsTrue(Boolean.FALSE);
    //    //获取答题记录
    //    List<QuestionRecord> questionRecords = questionRecordMapper.selectList(param);
    //    if (CollectionUtils.isEmpty(questionRecords)) {
    //        result.setIsPass(Boolean.TRUE);
    //        result.setNextMissionInfo(missionTService.getJumpMissionInfo(mission.getId()));
    //        return result;
    //    }
    //    result.setErrorNum(questionRecords.size());
    //    //获取答题结果详情(子类实现)
    //    doQuestionRecord(result, questionRecords, mission);
    //    if (result.getIsPass()) {
    //        result.setNextMissionInfo(missionTService.getJumpMissionInfo(mission.getId()));
    //    }
    //    return result;
    //}
    //
    //@Override
    //public List<Object> testListPreview(Object request) {
    //    List<EnTestDto> result = new ArrayList<>();
    //    List<ResQuestion> resQuestionList = getResQuestion(request.getId().longValue());
    //    if (CollectionUtils.isEmpty(resQuestionList)) {
    //        return result;
    //    }
    //    List<Long> questionIds = getQuestionIds(resQuestionList);
    //    transformToEnTestDtoList(result, resQuestionList, getResQuestionItemList(questionIds));
    //    return result;
    //}
    //

    /**
     * 处理用户的答案
     *
     * @param request 请求
     * @param mission 关卡
     * @return 解析结果
     */
    protected abstract Object doAnalysisTestAnswer(Object request, Object mission);

    /**
     * 完成解析后的响应处理,只有过关后才会执行。
     *
     * @param request
     * @param mission
     * @param userMission
     */
    protected abstract void afterCompletion(Object request, Object mission, Object userMission);

    /**
     * 获取有序的题目集合
     *
     * @param resourceId 资源id
     * @return
     */
    protected abstract List<Object> getResQuestion(Long resourceId);

    /**
     * 设置最近的测试记录
     *
     * @param result          测试返回结果
     * @param questionRecords 答题记录
     * @param mission         关卡
     */
    protected abstract void doQuestionRecord(Object result, List<Object> questionRecords, Object mission);

}
