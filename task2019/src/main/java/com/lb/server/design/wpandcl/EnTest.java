package com.lb.server.design.wpandcl;

import java.util.List;

/**
 * ella英语 考试接口
 *
 * @author LiBin
 * @email libin@ellabook.cn
 * @create 2018-08-07 11:03
 **/
public interface EnTest {

    /**
     * 获取测验的题目列表
     *
     * @param request {@link Object }
     * @return {@link Object} 不会返回Null
     */
    List<Object> getTestList(Object request);

    ///**
    // * 提交答案的处理 解析
    // *
    // * @param request {@link TestAnswerRequest }
    // * @return AnalysisTestInfoDto 不会返回Null
    // */
    //AnalysisTestInfoDto analysisTestAnswer(TestAnswerRequest request);
    //
    ///**
    // * 获取最近的测验结果
    // *
    // * @param request {@link TestAnswerRequest }
    // * @return TestRecordDto 不会返回Null
    // */
    //TestRecordDto getLastTimeQuestionRecord(GetEnTestListRequest request);
    //
    ///**
    // * 习题预览<br/>
    // * 区别getTestList方法 入参不是关卡id 而是考试，测试相应的id
    // *
    // * @param request {@link GetEnTestListRequest }
    // * @return {@link EnTestDto} 不会返回Null
    // */
    //List<EnTestDto> testListPreview(GetEnTestListRequest request);
}
