package com.lb.server.design.wpandcl;

/**
 * @author LiBin
 * @version 1.0
 * @date Created in 10:05 2018/8/8
 */
public enum EnTestTypeEnum {
    /**
     * 课后小测验
     */
    COURSE("course", CourseTestServiceImpl.class),
    /**
     * 阶段性测试
     */
    TEST("test", ProgressTestServiceImpl.class),
    /**
     * 考试
     */
    EXAM("exam", ExamTestServiceImpl.class),;


    private String type;

    private Class clazz;

    EnTestTypeEnum(String type, Class clazz) {
        this.type = type;
        this.clazz = clazz;
    }

    public static Class getTypeClass(String type) {
        for (EnTestTypeEnum e : EnTestTypeEnum.values()) {
            if (e.getType().equalsIgnoreCase(type)) {
                return e.getClazz();
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public Class getClazz() {
        return clazz;
    }
}
