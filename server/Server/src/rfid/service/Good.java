/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package rfid.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-09")
public class Good implements org.apache.thrift.TBase<Good, Good._Fields>, java.io.Serializable, Cloneable, Comparable<Good> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Good");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("Code", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("Num", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IS__BOM_FIELD_DESC = new org.apache.thrift.protocol.TField("Is_Bom", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField DETAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("Detail", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField UNIT_FIELD_DESC = new org.apache.thrift.protocol.TField("Unit", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField EXPECTED__QUANTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("Expected_Quantity", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GoodStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GoodTupleSchemeFactory());
  }

  public String Code; // required
  public int Num; // optional
  public boolean Is_Bom; // required
  public String Detail; // required
  public String Unit; // optional
  public int Expected_Quantity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "Code"),
    NUM((short)2, "Num"),
    IS__BOM((short)3, "Is_Bom"),
    DETAIL((short)4, "Detail"),
    UNIT((short)5, "Unit"),
    EXPECTED__QUANTITY((short)6, "Expected_Quantity");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CODE
          return CODE;
        case 2: // NUM
          return NUM;
        case 3: // IS__BOM
          return IS__BOM;
        case 4: // DETAIL
          return DETAIL;
        case 5: // UNIT
          return UNIT;
        case 6: // EXPECTED__QUANTITY
          return EXPECTED__QUANTITY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NUM_ISSET_ID = 0;
  private static final int __IS_BOM_ISSET_ID = 1;
  private static final int __EXPECTED_QUANTITY_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NUM,_Fields.UNIT,_Fields.EXPECTED__QUANTITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("Code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM, new org.apache.thrift.meta_data.FieldMetaData("Num", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS__BOM, new org.apache.thrift.meta_data.FieldMetaData("Is_Bom", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DETAIL, new org.apache.thrift.meta_data.FieldMetaData("Detail", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNIT, new org.apache.thrift.meta_data.FieldMetaData("Unit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPECTED__QUANTITY, new org.apache.thrift.meta_data.FieldMetaData("Expected_Quantity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Good.class, metaDataMap);
  }

  public Good() {
    this.Num = 0;

    this.Unit = "N";

    this.Expected_Quantity = 0;

  }

  public Good(
    String Code,
    boolean Is_Bom,
    String Detail)
  {
    this();
    this.Code = Code;
    this.Is_Bom = Is_Bom;
    setIs_BomIsSet(true);
    this.Detail = Detail;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Good(Good other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCode()) {
      this.Code = other.Code;
    }
    this.Num = other.Num;
    this.Is_Bom = other.Is_Bom;
    if (other.isSetDetail()) {
      this.Detail = other.Detail;
    }
    if (other.isSetUnit()) {
      this.Unit = other.Unit;
    }
    this.Expected_Quantity = other.Expected_Quantity;
  }

  public Good deepCopy() {
    return new Good(this);
  }

  @Override
  public void clear() {
    this.Code = null;
    this.Num = 0;

    setIs_BomIsSet(false);
    this.Is_Bom = false;
    this.Detail = null;
    this.Unit = "N";

    this.Expected_Quantity = 0;

  }

  public String getCode() {
    return this.Code;
  }

  public Good setCode(String Code) {
    this.Code = Code;
    return this;
  }

  public void unsetCode() {
    this.Code = null;
  }

  /** Returns true if field Code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.Code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.Code = null;
    }
  }

  public int getNum() {
    return this.Num;
  }

  public Good setNum(int Num) {
    this.Num = Num;
    setNumIsSet(true);
    return this;
  }

  public void unsetNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  /** Returns true if field Num is set (has been assigned a value) and false otherwise */
  public boolean isSetNum() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_ISSET_ID);
  }

  public void setNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_ISSET_ID, value);
  }

  public boolean isIs_Bom() {
    return this.Is_Bom;
  }

  public Good setIs_Bom(boolean Is_Bom) {
    this.Is_Bom = Is_Bom;
    setIs_BomIsSet(true);
    return this;
  }

  public void unsetIs_Bom() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_BOM_ISSET_ID);
  }

  /** Returns true if field Is_Bom is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_Bom() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_BOM_ISSET_ID);
  }

  public void setIs_BomIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_BOM_ISSET_ID, value);
  }

  public String getDetail() {
    return this.Detail;
  }

  public Good setDetail(String Detail) {
    this.Detail = Detail;
    return this;
  }

  public void unsetDetail() {
    this.Detail = null;
  }

  /** Returns true if field Detail is set (has been assigned a value) and false otherwise */
  public boolean isSetDetail() {
    return this.Detail != null;
  }

  public void setDetailIsSet(boolean value) {
    if (!value) {
      this.Detail = null;
    }
  }

  public String getUnit() {
    return this.Unit;
  }

  public Good setUnit(String Unit) {
    this.Unit = Unit;
    return this;
  }

  public void unsetUnit() {
    this.Unit = null;
  }

  /** Returns true if field Unit is set (has been assigned a value) and false otherwise */
  public boolean isSetUnit() {
    return this.Unit != null;
  }

  public void setUnitIsSet(boolean value) {
    if (!value) {
      this.Unit = null;
    }
  }

  public int getExpected_Quantity() {
    return this.Expected_Quantity;
  }

  public Good setExpected_Quantity(int Expected_Quantity) {
    this.Expected_Quantity = Expected_Quantity;
    setExpected_QuantityIsSet(true);
    return this;
  }

  public void unsetExpected_Quantity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPECTED_QUANTITY_ISSET_ID);
  }

  /** Returns true if field Expected_Quantity is set (has been assigned a value) and false otherwise */
  public boolean isSetExpected_Quantity() {
    return EncodingUtils.testBit(__isset_bitfield, __EXPECTED_QUANTITY_ISSET_ID);
  }

  public void setExpected_QuantityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPECTED_QUANTITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case NUM:
      if (value == null) {
        unsetNum();
      } else {
        setNum((Integer)value);
      }
      break;

    case IS__BOM:
      if (value == null) {
        unsetIs_Bom();
      } else {
        setIs_Bom((Boolean)value);
      }
      break;

    case DETAIL:
      if (value == null) {
        unsetDetail();
      } else {
        setDetail((String)value);
      }
      break;

    case UNIT:
      if (value == null) {
        unsetUnit();
      } else {
        setUnit((String)value);
      }
      break;

    case EXPECTED__QUANTITY:
      if (value == null) {
        unsetExpected_Quantity();
      } else {
        setExpected_Quantity((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case NUM:
      return getNum();

    case IS__BOM:
      return isIs_Bom();

    case DETAIL:
      return getDetail();

    case UNIT:
      return getUnit();

    case EXPECTED__QUANTITY:
      return getExpected_Quantity();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case NUM:
      return isSetNum();
    case IS__BOM:
      return isSetIs_Bom();
    case DETAIL:
      return isSetDetail();
    case UNIT:
      return isSetUnit();
    case EXPECTED__QUANTITY:
      return isSetExpected_Quantity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Good)
      return this.equals((Good)that);
    return false;
  }

  public boolean equals(Good that) {
    if (that == null)
      return false;

    boolean this_present_Code = true && this.isSetCode();
    boolean that_present_Code = true && that.isSetCode();
    if (this_present_Code || that_present_Code) {
      if (!(this_present_Code && that_present_Code))
        return false;
      if (!this.Code.equals(that.Code))
        return false;
    }

    boolean this_present_Num = true && this.isSetNum();
    boolean that_present_Num = true && that.isSetNum();
    if (this_present_Num || that_present_Num) {
      if (!(this_present_Num && that_present_Num))
        return false;
      if (this.Num != that.Num)
        return false;
    }

    boolean this_present_Is_Bom = true;
    boolean that_present_Is_Bom = true;
    if (this_present_Is_Bom || that_present_Is_Bom) {
      if (!(this_present_Is_Bom && that_present_Is_Bom))
        return false;
      if (this.Is_Bom != that.Is_Bom)
        return false;
    }

    boolean this_present_Detail = true && this.isSetDetail();
    boolean that_present_Detail = true && that.isSetDetail();
    if (this_present_Detail || that_present_Detail) {
      if (!(this_present_Detail && that_present_Detail))
        return false;
      if (!this.Detail.equals(that.Detail))
        return false;
    }

    boolean this_present_Unit = true && this.isSetUnit();
    boolean that_present_Unit = true && that.isSetUnit();
    if (this_present_Unit || that_present_Unit) {
      if (!(this_present_Unit && that_present_Unit))
        return false;
      if (!this.Unit.equals(that.Unit))
        return false;
    }

    boolean this_present_Expected_Quantity = true && this.isSetExpected_Quantity();
    boolean that_present_Expected_Quantity = true && that.isSetExpected_Quantity();
    if (this_present_Expected_Quantity || that_present_Expected_Quantity) {
      if (!(this_present_Expected_Quantity && that_present_Expected_Quantity))
        return false;
      if (this.Expected_Quantity != that.Expected_Quantity)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Code = true && (isSetCode());
    list.add(present_Code);
    if (present_Code)
      list.add(Code);

    boolean present_Num = true && (isSetNum());
    list.add(present_Num);
    if (present_Num)
      list.add(Num);

    boolean present_Is_Bom = true;
    list.add(present_Is_Bom);
    if (present_Is_Bom)
      list.add(Is_Bom);

    boolean present_Detail = true && (isSetDetail());
    list.add(present_Detail);
    if (present_Detail)
      list.add(Detail);

    boolean present_Unit = true && (isSetUnit());
    list.add(present_Unit);
    if (present_Unit)
      list.add(Unit);

    boolean present_Expected_Quantity = true && (isSetExpected_Quantity());
    list.add(present_Expected_Quantity);
    if (present_Expected_Quantity)
      list.add(Expected_Quantity);

    return list.hashCode();
  }

  @Override
  public int compareTo(Good other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Code, other.Code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum()).compareTo(other.isSetNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Num, other.Num);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_Bom()).compareTo(other.isSetIs_Bom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_Bom()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Is_Bom, other.Is_Bom);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetail()).compareTo(other.isSetDetail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Detail, other.Detail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnit()).compareTo(other.isSetUnit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Unit, other.Unit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpected_Quantity()).compareTo(other.isSetExpected_Quantity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpected_Quantity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Expected_Quantity, other.Expected_Quantity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Good(");
    boolean first = true;

    sb.append("Code:");
    if (this.Code == null) {
      sb.append("null");
    } else {
      sb.append(this.Code);
    }
    first = false;
    if (isSetNum()) {
      if (!first) sb.append(", ");
      sb.append("Num:");
      sb.append(this.Num);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("Is_Bom:");
    sb.append(this.Is_Bom);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Detail:");
    if (this.Detail == null) {
      sb.append("null");
    } else {
      sb.append(this.Detail);
    }
    first = false;
    if (isSetUnit()) {
      if (!first) sb.append(", ");
      sb.append("Unit:");
      if (this.Unit == null) {
        sb.append("null");
      } else {
        sb.append(this.Unit);
      }
      first = false;
    }
    if (isSetExpected_Quantity()) {
      if (!first) sb.append(", ");
      sb.append("Expected_Quantity:");
      sb.append(this.Expected_Quantity);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (Code == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Code' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'Is_Bom' because it's a primitive and you chose the non-beans generator.
    if (Detail == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'Detail' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GoodStandardSchemeFactory implements SchemeFactory {
    public GoodStandardScheme getScheme() {
      return new GoodStandardScheme();
    }
  }

  private static class GoodStandardScheme extends StandardScheme<Good> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Good struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Num = iprot.readI32();
              struct.setNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS__BOM
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.Is_Bom = iprot.readBool();
              struct.setIs_BomIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DETAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Detail = iprot.readString();
              struct.setDetailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UNIT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Unit = iprot.readString();
              struct.setUnitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXPECTED__QUANTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Expected_Quantity = iprot.readI32();
              struct.setExpected_QuantityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIs_Bom()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'Is_Bom' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Good struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.Code);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNum()) {
        oprot.writeFieldBegin(NUM_FIELD_DESC);
        oprot.writeI32(struct.Num);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS__BOM_FIELD_DESC);
      oprot.writeBool(struct.Is_Bom);
      oprot.writeFieldEnd();
      if (struct.Detail != null) {
        oprot.writeFieldBegin(DETAIL_FIELD_DESC);
        oprot.writeString(struct.Detail);
        oprot.writeFieldEnd();
      }
      if (struct.Unit != null) {
        if (struct.isSetUnit()) {
          oprot.writeFieldBegin(UNIT_FIELD_DESC);
          oprot.writeString(struct.Unit);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetExpected_Quantity()) {
        oprot.writeFieldBegin(EXPECTED__QUANTITY_FIELD_DESC);
        oprot.writeI32(struct.Expected_Quantity);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GoodTupleSchemeFactory implements SchemeFactory {
    public GoodTupleScheme getScheme() {
      return new GoodTupleScheme();
    }
  }

  private static class GoodTupleScheme extends TupleScheme<Good> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Good struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.Code);
      oprot.writeBool(struct.Is_Bom);
      oprot.writeString(struct.Detail);
      BitSet optionals = new BitSet();
      if (struct.isSetNum()) {
        optionals.set(0);
      }
      if (struct.isSetUnit()) {
        optionals.set(1);
      }
      if (struct.isSetExpected_Quantity()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNum()) {
        oprot.writeI32(struct.Num);
      }
      if (struct.isSetUnit()) {
        oprot.writeString(struct.Unit);
      }
      if (struct.isSetExpected_Quantity()) {
        oprot.writeI32(struct.Expected_Quantity);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Good struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.Code = iprot.readString();
      struct.setCodeIsSet(true);
      struct.Is_Bom = iprot.readBool();
      struct.setIs_BomIsSet(true);
      struct.Detail = iprot.readString();
      struct.setDetailIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.Num = iprot.readI32();
        struct.setNumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Unit = iprot.readString();
        struct.setUnitIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Expected_Quantity = iprot.readI32();
        struct.setExpected_QuantityIsSet(true);
      }
    }
  }

}

