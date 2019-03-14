package com.lb.server.design.wpandcl;

import java.util.List;

/**
 * @author LiBin
 * @email libin@ellabook.cn
 * @create 2018-08-07 17:37
 **/
public class ExamTestServiceImpl extends AbstractEnTest {


    @Override
    protected Object doAnalysisTestAnswer(Object request, Object mission) {
        return null;
    }

    @Override
    protected void afterCompletion(Object request, Object mission, Object userMission) {

    }

    @Override
    protected List<Object> getResQuestion(Long resourceId) {
        //return resQuestionMapper.selectExamQuestionByExamId(resourceId);
        //获取考试的题目
        return null;
    }

    @Override
    protected void doQuestionRecord(Object result, List<Object> questionRecords, Object mission) {

    }

}
