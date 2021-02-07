package cn.edu.hcxy.bean;

public class CustomerInformation {//乘客信息
    private String zwq_id;
    private String zwq_filghtId;
    private String zwq_name;
    private String zwq_phoneId;
    private String zwq_identityCardId;//身份证号码
    private    int zwq_orderNumber;//该乘客需要一次性订几张票
    private String zwq_customerType;
    private String zwq_sex;


    public CustomerInformation(String zwq_name, String zwq_sex) {
        this.zwq_name = zwq_name;
        this.zwq_sex = zwq_sex;
    }

    public CustomerInformation(String zwq_id, String zwq_filghtId, String zwq_name, String zwq_phoneId, String zwq_identityCardId, int zwq_orderNumber, String zwq_customerType, String zwq_sex) {
        this.zwq_id = zwq_id;
        this.zwq_filghtId = zwq_filghtId;
        this.zwq_name = zwq_name;
        this.zwq_phoneId = zwq_phoneId;
        this.zwq_identityCardId = zwq_identityCardId;
        this.zwq_orderNumber = zwq_orderNumber;
        this.zwq_customerType = zwq_customerType;
        this.zwq_sex = zwq_sex;
    }

    public String getZwq_id() {
        return zwq_id;
    }

    public void setZwq_id(String zwq_id) {
        this.zwq_id = zwq_id;
    }

    public String getZwq_filghtId() {
        return zwq_filghtId;
    }

    public void setZwq_filghtId(String zwq_filghtId) {
        this.zwq_filghtId = zwq_filghtId;
    }

    public String getZwq_name() {
        return zwq_name;
    }

    public void setZwq_name(String zwq_name) {
        this.zwq_name = zwq_name;
    }

    public String getZwq_phoneId() {
        return zwq_phoneId;
    }

    public void setZwq_phoneId(String zwq_phoneId) {
        this.zwq_phoneId = zwq_phoneId;
    }

    public String getZwq_identityCardId() {
        return zwq_identityCardId;
    }

    public void setZwq_identityCardId(String zwq_identityCardId) {
        this.zwq_identityCardId = zwq_identityCardId;
    }

    public int getZwq_orderNumber() {
        return zwq_orderNumber;
    }

    public void setZwq_orderNumber(int zwq_orderNumber) {
        this.zwq_orderNumber = zwq_orderNumber;
    }

    public String getZwq_customerType() {
        return zwq_customerType;
    }

    public void setZwq_customerType(String zwq_customerType) {
        this.zwq_customerType = zwq_customerType;
    }

    public String getZwq_sex() {
        return zwq_sex;
    }

    public void setZwq_sex(String zwq_sex) {
        this.zwq_sex = zwq_sex;
    }

    public String toString(int a)
    {
        return  "该乘客的航班信息为{" +
                ", 姓名='" + zwq_name + '\'' +
                ", 性别='" + zwq_sex + '\'' ;
    }

    @Override
    public String toString() {
        return "CustomerInformation{" +
                "zwq_id='" + zwq_id + '\'' +
                ", 航班号='" + zwq_filghtId + '\'' +
                ", 姓名='" + zwq_name + '\'' +
                ", 电话号码='" + zwq_phoneId + '\'' +
                ", 身份证号码='" + zwq_identityCardId + '\'' +
                ", 预订数=" + zwq_orderNumber +
                ", 乘客类型='" + zwq_customerType + '\'' +
                ", 性别='" + zwq_sex + '\'' +
                '}';
    }
}
