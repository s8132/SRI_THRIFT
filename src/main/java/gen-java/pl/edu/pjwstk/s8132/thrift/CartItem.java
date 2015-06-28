/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package pl.edu.pjwstk.s8132.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-6-28")
public class CartItem implements org.apache.thrift.TBase<CartItem, CartItem._Fields>, java.io.Serializable, Cloneable, Comparable<CartItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CartItem");

  private static final org.apache.thrift.protocol.TField PRODUCT_FIELD_DESC = new org.apache.thrift.protocol.TField("product", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CartItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CartItemTupleSchemeFactory());
  }

  public Product product; // required
  public int amount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRODUCT((short)1, "product"),
    AMOUNT((short)2, "amount");

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
        case 1: // PRODUCT
          return PRODUCT;
        case 2: // AMOUNT
          return AMOUNT;
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
  private static final int __AMOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRODUCT, new org.apache.thrift.meta_data.FieldMetaData("product", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Product.class)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CartItem.class, metaDataMap);
  }

  public CartItem() {
    this.amount = 1;

  }

  public CartItem(
    Product product,
    int amount)
  {
    this();
    this.product = product;
    this.amount = amount;
    setAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CartItem(CartItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProduct()) {
      this.product = new Product(other.product);
    }
    this.amount = other.amount;
  }

  public CartItem deepCopy() {
    return new CartItem(this);
  }

  @Override
  public void clear() {
    this.product = null;
    this.amount = 1;

  }

  public Product getProduct() {
    return this.product;
  }

  public CartItem setProduct(Product product) {
    this.product = product;
    return this;
  }

  public void unsetProduct() {
    this.product = null;
  }

  /** Returns true if field product is set (has been assigned a value) and false otherwise */
  public boolean isSetProduct() {
    return this.product != null;
  }

  public void setProductIsSet(boolean value) {
    if (!value) {
      this.product = null;
    }
  }

  public int getAmount() {
    return this.amount;
  }

  public CartItem setAmount(int amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRODUCT:
      if (value == null) {
        unsetProduct();
      } else {
        setProduct((Product)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRODUCT:
      return getProduct();

    case AMOUNT:
      return Integer.valueOf(getAmount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRODUCT:
      return isSetProduct();
    case AMOUNT:
      return isSetAmount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CartItem)
      return this.equals((CartItem)that);
    return false;
  }

  public boolean equals(CartItem that) {
    if (that == null)
      return false;

    boolean this_present_product = true && this.isSetProduct();
    boolean that_present_product = true && that.isSetProduct();
    if (this_present_product || that_present_product) {
      if (!(this_present_product && that_present_product))
        return false;
      if (!this.product.equals(that.product))
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_product = true && (isSetProduct());
    list.add(present_product);
    if (present_product)
      list.add(product);

    boolean present_amount = true;
    list.add(present_amount);
    if (present_amount)
      list.add(amount);

    return list.hashCode();
  }

  @Override
  public int compareTo(CartItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProduct()).compareTo(other.isSetProduct());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProduct()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.product, other.product);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
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
    StringBuilder sb = new StringBuilder("CartItem(");
    boolean first = true;

    sb.append("product:");
    if (this.product == null) {
      sb.append("null");
    } else {
      sb.append(this.product);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (product != null) {
      product.validate();
    }
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

  private static class CartItemStandardSchemeFactory implements SchemeFactory {
    public CartItemStandardScheme getScheme() {
      return new CartItemStandardScheme();
    }
  }

  private static class CartItemStandardScheme extends StandardScheme<CartItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CartItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRODUCT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.product = new Product();
              struct.product.read(iprot);
              struct.setProductIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.amount = iprot.readI32();
              struct.setAmountIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CartItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.product != null) {
        oprot.writeFieldBegin(PRODUCT_FIELD_DESC);
        struct.product.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeI32(struct.amount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CartItemTupleSchemeFactory implements SchemeFactory {
    public CartItemTupleScheme getScheme() {
      return new CartItemTupleScheme();
    }
  }

  private static class CartItemTupleScheme extends TupleScheme<CartItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CartItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProduct()) {
        optionals.set(0);
      }
      if (struct.isSetAmount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetProduct()) {
        struct.product.write(oprot);
      }
      if (struct.isSetAmount()) {
        oprot.writeI32(struct.amount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CartItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.product = new Product();
        struct.product.read(iprot);
        struct.setProductIsSet(true);
      }
      if (incoming.get(1)) {
        struct.amount = iprot.readI32();
        struct.setAmountIsSet(true);
      }
    }
  }

}
