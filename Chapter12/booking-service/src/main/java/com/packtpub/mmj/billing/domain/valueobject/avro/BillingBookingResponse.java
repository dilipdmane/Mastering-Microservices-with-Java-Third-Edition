/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.packtpub.mmj.billing.domain.valueobject.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BillingBookingResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1140100868869506508L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BillingBookingResponse\",\"namespace\":\"com.packtpub.mmj.billing.domain.valueobject.avro\",\"fields\":[{\"name\":\"billId\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"bookingId\",\"type\":\"string\"},{\"name\":\"restaurantId\",\"type\":\"string\"},{\"name\":\"tableId\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"date\",\"type\":[\"null\",\"string\"]},{\"name\":\"time\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BillingBookingResponse> ENCODER =
      new BinaryMessageEncoder<BillingBookingResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BillingBookingResponse> DECODER =
      new BinaryMessageDecoder<BillingBookingResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BillingBookingResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BillingBookingResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BillingBookingResponse>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BillingBookingResponse to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BillingBookingResponse from a ByteBuffer. */
  public static BillingBookingResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence billId;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence bookingId;
  @Deprecated public java.lang.CharSequence restaurantId;
  @Deprecated public java.lang.CharSequence tableId;
  @Deprecated public java.lang.CharSequence status;
  @Deprecated public java.lang.CharSequence date;
  @Deprecated public java.lang.CharSequence time;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BillingBookingResponse() {}

  /**
   * All-args constructor.
   * @param billId The new value for billId
   * @param name The new value for name
   * @param bookingId The new value for bookingId
   * @param restaurantId The new value for restaurantId
   * @param tableId The new value for tableId
   * @param status The new value for status
   * @param date The new value for date
   * @param time The new value for time
   */
  public BillingBookingResponse(java.lang.CharSequence billId, java.lang.CharSequence name, java.lang.CharSequence bookingId, java.lang.CharSequence restaurantId, java.lang.CharSequence tableId, java.lang.CharSequence status, java.lang.CharSequence date, java.lang.CharSequence time) {
    this.billId = billId;
    this.name = name;
    this.bookingId = bookingId;
    this.restaurantId = restaurantId;
    this.tableId = tableId;
    this.status = status;
    this.date = date;
    this.time = time;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return billId;
    case 1: return name;
    case 2: return bookingId;
    case 3: return restaurantId;
    case 4: return tableId;
    case 5: return status;
    case 6: return date;
    case 7: return time;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: billId = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: bookingId = (java.lang.CharSequence)value$; break;
    case 3: restaurantId = (java.lang.CharSequence)value$; break;
    case 4: tableId = (java.lang.CharSequence)value$; break;
    case 5: status = (java.lang.CharSequence)value$; break;
    case 6: date = (java.lang.CharSequence)value$; break;
    case 7: time = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'billId' field.
   * @return The value of the 'billId' field.
   */
  public java.lang.CharSequence getBillId() {
    return billId;
  }

  /**
   * Sets the value of the 'billId' field.
   * @param value the value to set.
   */
  public void setBillId(java.lang.CharSequence value) {
    this.billId = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'bookingId' field.
   * @return The value of the 'bookingId' field.
   */
  public java.lang.CharSequence getBookingId() {
    return bookingId;
  }

  /**
   * Sets the value of the 'bookingId' field.
   * @param value the value to set.
   */
  public void setBookingId(java.lang.CharSequence value) {
    this.bookingId = value;
  }

  /**
   * Gets the value of the 'restaurantId' field.
   * @return The value of the 'restaurantId' field.
   */
  public java.lang.CharSequence getRestaurantId() {
    return restaurantId;
  }

  /**
   * Sets the value of the 'restaurantId' field.
   * @param value the value to set.
   */
  public void setRestaurantId(java.lang.CharSequence value) {
    this.restaurantId = value;
  }

  /**
   * Gets the value of the 'tableId' field.
   * @return The value of the 'tableId' field.
   */
  public java.lang.CharSequence getTableId() {
    return tableId;
  }

  /**
   * Sets the value of the 'tableId' field.
   * @param value the value to set.
   */
  public void setTableId(java.lang.CharSequence value) {
    this.tableId = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.CharSequence getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The value of the 'time' field.
   */
  public java.lang.CharSequence getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * @param value the value to set.
   */
  public void setTime(java.lang.CharSequence value) {
    this.time = value;
  }

  /**
   * Creates a new BillingBookingResponse RecordBuilder.
   * @return A new BillingBookingResponse RecordBuilder
   */
  public static com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder newBuilder() {
    return new com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder();
  }

  /**
   * Creates a new BillingBookingResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BillingBookingResponse RecordBuilder
   */
  public static com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder newBuilder(com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder other) {
    return new com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder(other);
  }

  /**
   * Creates a new BillingBookingResponse RecordBuilder by copying an existing BillingBookingResponse instance.
   * @param other The existing instance to copy.
   * @return A new BillingBookingResponse RecordBuilder
   */
  public static com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder newBuilder(com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse other) {
    return new com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder(other);
  }

  /**
   * RecordBuilder for BillingBookingResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BillingBookingResponse>
    implements org.apache.avro.data.RecordBuilder<BillingBookingResponse> {

    private java.lang.CharSequence billId;
    private java.lang.CharSequence name;
    private java.lang.CharSequence bookingId;
    private java.lang.CharSequence restaurantId;
    private java.lang.CharSequence tableId;
    private java.lang.CharSequence status;
    private java.lang.CharSequence date;
    private java.lang.CharSequence time;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.billId)) {
        this.billId = data().deepCopy(fields()[0].schema(), other.billId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bookingId)) {
        this.bookingId = data().deepCopy(fields()[2].schema(), other.bookingId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.restaurantId)) {
        this.restaurantId = data().deepCopy(fields()[3].schema(), other.restaurantId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tableId)) {
        this.tableId = data().deepCopy(fields()[4].schema(), other.tableId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.date)) {
        this.date = data().deepCopy(fields()[6].schema(), other.date);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.time)) {
        this.time = data().deepCopy(fields()[7].schema(), other.time);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BillingBookingResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.billId)) {
        this.billId = data().deepCopy(fields()[0].schema(), other.billId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.bookingId)) {
        this.bookingId = data().deepCopy(fields()[2].schema(), other.bookingId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.restaurantId)) {
        this.restaurantId = data().deepCopy(fields()[3].schema(), other.restaurantId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tableId)) {
        this.tableId = data().deepCopy(fields()[4].schema(), other.tableId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.status)) {
        this.status = data().deepCopy(fields()[5].schema(), other.status);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.date)) {
        this.date = data().deepCopy(fields()[6].schema(), other.date);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.time)) {
        this.time = data().deepCopy(fields()[7].schema(), other.time);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'billId' field.
      * @return The value.
      */
    public java.lang.CharSequence getBillId() {
      return billId;
    }

    /**
      * Sets the value of the 'billId' field.
      * @param value The value of 'billId'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setBillId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.billId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'billId' field has been set.
      * @return True if the 'billId' field has been set, false otherwise.
      */
    public boolean hasBillId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'billId' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearBillId() {
      billId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'bookingId' field.
      * @return The value.
      */
    public java.lang.CharSequence getBookingId() {
      return bookingId;
    }

    /**
      * Sets the value of the 'bookingId' field.
      * @param value The value of 'bookingId'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setBookingId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.bookingId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'bookingId' field has been set.
      * @return True if the 'bookingId' field has been set, false otherwise.
      */
    public boolean hasBookingId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'bookingId' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearBookingId() {
      bookingId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'restaurantId' field.
      * @return The value.
      */
    public java.lang.CharSequence getRestaurantId() {
      return restaurantId;
    }

    /**
      * Sets the value of the 'restaurantId' field.
      * @param value The value of 'restaurantId'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setRestaurantId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.restaurantId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'restaurantId' field has been set.
      * @return True if the 'restaurantId' field has been set, false otherwise.
      */
    public boolean hasRestaurantId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'restaurantId' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearRestaurantId() {
      restaurantId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'tableId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTableId() {
      return tableId;
    }

    /**
      * Sets the value of the 'tableId' field.
      * @param value The value of 'tableId'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setTableId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.tableId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'tableId' field has been set.
      * @return True if the 'tableId' field has been set, false otherwise.
      */
    public boolean hasTableId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'tableId' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearTableId() {
      tableId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.status = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearStatus() {
      status = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return date;
    }

    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.date = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearDate() {
      date = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * @return The value.
      */
    public java.lang.CharSequence getTime() {
      return time;
    }

    /**
      * Sets the value of the 'time' field.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder setTime(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.time = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'time' field.
      * @return This builder.
      */
    public com.packtpub.mmj.billing.domain.valueobject.avro.BillingBookingResponse.Builder clearTime() {
      time = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BillingBookingResponse build() {
      try {
        BillingBookingResponse record = new BillingBookingResponse();
        record.billId = fieldSetFlags()[0] ? this.billId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.bookingId = fieldSetFlags()[2] ? this.bookingId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.restaurantId = fieldSetFlags()[3] ? this.restaurantId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.tableId = fieldSetFlags()[4] ? this.tableId : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.status = fieldSetFlags()[5] ? this.status : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.date = fieldSetFlags()[6] ? this.date : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.time = fieldSetFlags()[7] ? this.time : (java.lang.CharSequence) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BillingBookingResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<BillingBookingResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BillingBookingResponse>
    READER$ = (org.apache.avro.io.DatumReader<BillingBookingResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
