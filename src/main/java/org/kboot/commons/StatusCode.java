/**
 * 文件名：com.amwell.commons.StatusCode.java
 * 版权：Copyright 2003 amwell.Shenzhen, Inc. All rights reserved.
 * 创建人：Ryan.Bian
 * 创建时间：2014-4-9
 * 修改内容：新增
 * 修改内容：
 */
package org.kboot.commons;

/**
 * 调用方法时返回的状态码
 * 
 * @author Ryan.Bian
 * @version V1.0 @2014-4-9[版本号, YYYY-MM-DD]
 * @see [相关类/方法]
 * @since Application Service System.
 */
public class StatusCode {

	/**
	 * 验证成功
	 */
	public static final int SUCCESS = 0; // 返回成功

	/**
	 * 验证成功
	 */
	public static final int EXCEPTION = -1; // 异常

	/**
	 * 不正确的用户和密码
	 */
	public static final int INVALID_USER = -1000; // 不正确的用户和密码

	/**
	 * 用户密码过期
	 */
	public static final int PWD_EXPIRED = -1001; // 用户密码过期

	/**
	 * 用户密码过期
	 */
	public static final int INVALID_NEW_PWD = -1002; // 新密码无效,新密码必须至少8个字符长,并且不能和旧密码一样

	/**
	 * 帐号状态无效
	 */
	public static final int INVALID_USER_STATUS=-1003;
	
	
	/**
	 * 无效用户名
	 */
	public static final int INVALID_USER_NAME = -1010; // 无效用户名

	/**
	 * 无效邮件地址
	 */
	public static final int INVALID_EMAIL = -1011; // 无效邮件地址

	/**
	 * 无效手机号
	 */
	public static final int INVALID_CELL_PHONE_NO = -1012; // 无效手机号

	/**
	 * 用户名已存在
	 */
	public static final int DUP_USER_NAME = -1013; // 用户名已存在

	/**
	 * 邮件地址已存在(注册用户信息)
	 */
	public static final int DUP_EMAIL = -1014; // 邮件地址已存在(注册用户信息)

	/**
	 * 移动电话已存在(注册用户信息)
	 */
	public static final int DUP_CELL_PHONE_NO = -1015; // 移动电话已存在(注册用户信息)

	/**
	 * 邮件地址已存在(修改用户信息)
	 */
	public static final int DUP_EMAIL_E = -1013; // 邮件地址已存在(修改用户信息)

	/**
	 * 移动电话已存在(修改用户信息)
	 */
	public static final int DUP_CELL_PHONE_NO_E = -1014; // 移动电话已存在(修改用户信息)

	/**
	 * 应用CODE不存在
	 */
	public static final int INVALID_APP_CODE = -1020; // 应用CODE不存在

	/**
	 * 角色CODE不存在
	 */
	public static final int INVALID_ROLE_CODE = -1021; // 角色CODE不存在

	/**
	 * 无效日期
	 */
	public static final int INVALID_EXP_DATE = -1022; // 无效日期

	/**
	 * 无效rstId
	 */
	public static final int INVALID_RESET_ID = -1031; // 无效日期

	/**
	 * 客户ID非法
	 */
	public static final int INVALID_CONSUMER_ID = -1041; // 非法客户ID

	/**
	 * 信息已经存在
	 */
	public static final int EXIST_CONSUMER_INFO = -1042; // 信息已经存在

	/**
	 * 参数错误
	 */
	public static final int ERROR_CONSUMER_PARAM = -1043; // 参数错误

	/**
	 * 非法删除 已拥有子节点
	 * 
	 */
	public static final int INVALID_DELETE_STORE_HASCHILD = -1044;

	/**
	 * 该部门已经存在用户信息
	 */
	public static final int DEPART_HAS_USER = -1055;

	/**
	 * 该商户已经存在门店信息
	 */
	public static final int MGRUSR_HAS_STORE = -1056;

	/**
     * 参数为nullu
     */
    public static final int PAR_IS_NULL = -1057;
	
	/**
	 * 该商户无此车型 请添加该类车型
	 */
	public static final int CAR_NO_MOTOTYPE = -1058;

    /**
     * 对象为null
     */
    public static final int OBJECT_IS_NULL = -10000;
    /**
     * 对象为null
     */
    public static final int CAR_IN_LEASE = -1059;  //该车辆在订单中使用 不能删除
    
    /**
     * 对象为null
     */
    public static final int COSUM_IN_LEASE = -1060;  //该用户在订单中使用 不能删除
    
    /**
     * 该车型被车辆使用,不能删除
     */
    public static final int CARMOTOL_IN_CAR = -1061;
    
    /**
     * 该车型存在于公司车型库中，不能添加
     */
    public static final int CARMOTOL_IN_COM = -1062;
    
    /**
     * 该车辆绑定了GPS设备，不能删除
     */
    public static final int CAR_IN_GPS = -1063;
    
    /**
     * 营业执照号已经存在
     */
    public static final int COM_NU_NO = -1064;
    
    /**
     * 车辆代驾费用的记录中存在该司机
     */
    public static final int CARBEH_DRIVER = -1065;
    
    /**
     * 该品牌已经被车型使用，不能删除
     */
    public static final int BRAND_IN_MOTOR = -1066;
    /**
     * 该附属品牌已经被车型使用，不能删除
     */
    public static final int BRANDATTR_IN_MOTOR = -1067;
    
    /**
     * 该品牌已经被附属品牌使用，不能删除
     */
    public static final int BRAND_IN_BRANDATTR = -1068;
    
    /**
     * 身份证已经存在
     */
    public static final int IDCARD_IN_DRIVER = -1069;
    
    /**
     * 车辆已被预订
     */
    public static final int CAR_IN_YD = -1070;
    /**
     * 车辆已被出租
     */
    public static final int CAR_IN_CZ = -1071;
    /**
     * 车辆已销售
     */
    public static final int CAR_IN_XS = -1072;
    
    /**
     * 客户存在贷款登记
     */
    public static final int CUS_IN_DK = -1073;
    
    /**
     * 重复错误码
     */
    public static final int REPEAT=-9999;
}
