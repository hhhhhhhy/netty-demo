//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.11 at 11:30:53 AM CST 
//


package mbpgate.domain;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}OpRetCode"/>
 *         &lt;element ref="{}OpRetMsg"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "opRetCode",
    "opRetMsg"
})
@XmlRootElement(name = "Head")
public class ClientResponseHead {

    @XmlElement(name = "OpRetCode", required = true)
    protected String opRetCode="";
    @XmlElement(name = "OpRetMsg", required = true)
//    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
//    @XmlSchemaType(name = "NCName")
    protected String opRetMsg="";

    /**
     * Gets the value of the opRetCode property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    public String getOpRetCode() {
        return opRetCode;
    }

    /**
     * Sets the value of the opRetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setOpRetCode(String value) {
        this.opRetCode = value;
    }

    /**
     * Gets the value of the opRetMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpRetMsg() {
        return opRetMsg;
    }

    /**
     * Sets the value of the opRetMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpRetMsg(String value) {
        this.opRetMsg = value;
    }

    @Override
    public String toString() {
        return "Head{" +
                "opRetCode=" + opRetCode +
                ", opRetMsg='" + opRetMsg + '\'' +
                '}';
    }
}
