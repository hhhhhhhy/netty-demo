package hfnb.model.base;

import java.io.Serializable;

/**
 * Created by Lichao.W At 2015/7/13 15:51
 * wanglichao@163.com
 */

public class TaHfnbTiaXmlInfo implements Serializable {
    public String txncode;            //交易代码
    public String userid;             //用户ID
    public String reqsn;              //交易流水号
    public String version;            //版本号
    public String txndate;            //交易日期
    public String txntime;            //交易时间
    public String bankbranchid;       //网点编号
    public String bankoperid;         //人员编号

    public String getTxncode() {
        return txncode;
    }

    public void setTxncode(String txncode) {
        this.txncode = txncode;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getReqsn() {
        return reqsn;
    }

    public void setReqsn(String reqsn) {
        this.reqsn = reqsn;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTxndate() {
        return txndate;
    }

    public void setTxndate(String txndate) {
        this.txndate = txndate;
    }

    public String getTxntime() {
        return txntime;
    }

    public void setTxntime(String txntime) {
        this.txntime = txntime;
    }

    public String getBankoperid() {
        return bankoperid;
    }

    public void setBankoperid(String bankoperid) {
        this.bankoperid = bankoperid;
    }

    public String getBankbranchid() {
        return bankbranchid;
    }

    public void setBankbranchid(String bankbranchid) {
        this.bankbranchid = bankbranchid;
    }
}


