package com.lb.server.design.wpandcl;

import java.util.List;

/**
 * @author Libin
 */
//@RestController
//@Log4j2
public class Test {

    public List<List<Object>> getEnTestList(String type) {
        //根据测试类型获取相应的实现类
        Class clazz = EnTestTypeEnum.getTypeClass(type);
        if (null == clazz) {
            //return ResponseParamUtils.build(CommonRetCode.PARAM_ERROR, null);
        }
        //EnTest enTest = (EnTest) ApplicationContextHelper.getBean(clazz);
        //return ResponseParamUtils.build(CommonRetCode.SUCCESS, enTest.getTestList(request));
        return null;
    }


}
