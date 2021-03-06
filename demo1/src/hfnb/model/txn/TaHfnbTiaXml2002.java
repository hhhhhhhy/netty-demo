package hfnb.model.txn;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;
import hfnb.model.base.TaHfnbTiaXml;
import hfnb.model.base.TaHfnbTiaXmlInfo;

import java.io.Serializable;

/**
 * Created by Lichao.W At 2015/7/13 15:51
 * wanglichao@163.com
 */

@XStreamAlias("root")
public class TaHfnbTiaXml2002 extends TaHfnbTiaXml {
    public TaHfnbTiaXmlInfo info;
    public Body body;

    public TaHfnbTiaXmlInfo getInfo() {
        return info;
    }

    public void setInfo(TaHfnbTiaXmlInfo info) {
        this.info = info;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public static class Body implements Serializable {
        public String originid;        //����������

        public String getOriginid() {
            return originid;
        }

        public void setOriginid(String originid) {
            this.originid = originid;
        }
    }

    @Override
    public TaHfnbTiaXml getTia(String xml) {
        XStream xs = new XStream(new DomDriver());
        xs.processAnnotations(TaHfnbTiaXml2002.class);
        return (TaHfnbTiaXml2002) xs.fromXML(xml);
    }
}
