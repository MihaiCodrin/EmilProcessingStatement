/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.uebercomputing.mailrecord;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class MailRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MailRecord\",\"namespace\":\"com.uebercomputing.mailrecord\",\"fields\":[{\"name\":\"uuid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"from\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"to\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"bcc\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"dateUtcEpoch\",\"type\":\"long\"},{\"name\":\"subject\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"mailFields\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"body\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"attachments\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Attachment\",\"fields\":[{\"name\":\"fileName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"size\",\"type\":\"int\"},{\"name\":\"mimeType\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"data\",\"type\":\"bytes\"}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence uuid;
  @Deprecated public java.lang.CharSequence from;
  @Deprecated public java.util.List<java.lang.CharSequence> to;
  @Deprecated public java.util.List<java.lang.CharSequence> cc;
  @Deprecated public java.util.List<java.lang.CharSequence> bcc;
  @Deprecated public long dateUtcEpoch;
  @Deprecated public java.lang.CharSequence subject;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> mailFields;
  @Deprecated public java.lang.CharSequence body;
  @Deprecated public java.util.List<com.uebercomputing.mailrecord.Attachment> attachments;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public MailRecord() {}

  /**
   * All-args constructor.
   */
  public MailRecord(java.lang.CharSequence uuid, java.lang.CharSequence from, java.util.List<java.lang.CharSequence> to, java.util.List<java.lang.CharSequence> cc, java.util.List<java.lang.CharSequence> bcc, java.lang.Long dateUtcEpoch, java.lang.CharSequence subject, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> mailFields, java.lang.CharSequence body, java.util.List<com.uebercomputing.mailrecord.Attachment> attachments) {
    this.uuid = uuid;
    this.from = from;
    this.to = to;
    this.cc = cc;
    this.bcc = bcc;
    this.dateUtcEpoch = dateUtcEpoch;
    this.subject = subject;
    this.mailFields = mailFields;
    this.body = body;
    this.attachments = attachments;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uuid;
    case 1: return from;
    case 2: return to;
    case 3: return cc;
    case 4: return bcc;
    case 5: return dateUtcEpoch;
    case 6: return subject;
    case 7: return mailFields;
    case 8: return body;
    case 9: return attachments;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uuid = (java.lang.CharSequence)value$; break;
    case 1: from = (java.lang.CharSequence)value$; break;
    case 2: to = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: cc = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: bcc = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: dateUtcEpoch = (java.lang.Long)value$; break;
    case 6: subject = (java.lang.CharSequence)value$; break;
    case 7: mailFields = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 8: body = (java.lang.CharSequence)value$; break;
    case 9: attachments = (java.util.List<com.uebercomputing.mailrecord.Attachment>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uuid' field.
   */
  public java.lang.CharSequence getUuid() {
    return uuid;
  }

  /**
   * Sets the value of the 'uuid' field.
   * @param value the value to set.
   */
  public void setUuid(java.lang.CharSequence value) {
    this.uuid = value;
  }

  /**
   * Gets the value of the 'from' field.
   */
  public java.lang.CharSequence getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(java.lang.CharSequence value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'to' field.
   */
  public java.util.List<java.lang.CharSequence> getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(java.util.List<java.lang.CharSequence> value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'cc' field.
   */
  public java.util.List<java.lang.CharSequence> getCc() {
    return cc;
  }

  /**
   * Sets the value of the 'cc' field.
   * @param value the value to set.
   */
  public void setCc(java.util.List<java.lang.CharSequence> value) {
    this.cc = value;
  }

  /**
   * Gets the value of the 'bcc' field.
   */
  public java.util.List<java.lang.CharSequence> getBcc() {
    return bcc;
  }

  /**
   * Sets the value of the 'bcc' field.
   * @param value the value to set.
   */
  public void setBcc(java.util.List<java.lang.CharSequence> value) {
    this.bcc = value;
  }

  /**
   * Gets the value of the 'dateUtcEpoch' field.
   */
  public java.lang.Long getDateUtcEpoch() {
    return dateUtcEpoch;
  }

  /**
   * Sets the value of the 'dateUtcEpoch' field.
   * @param value the value to set.
   */
  public void setDateUtcEpoch(java.lang.Long value) {
    this.dateUtcEpoch = value;
  }

  /**
   * Gets the value of the 'subject' field.
   */
  public java.lang.CharSequence getSubject() {
    return subject;
  }

  /**
   * Sets the value of the 'subject' field.
   * @param value the value to set.
   */
  public void setSubject(java.lang.CharSequence value) {
    this.subject = value;
  }

  /**
   * Gets the value of the 'mailFields' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getMailFields() {
    return mailFields;
  }

  /**
   * Sets the value of the 'mailFields' field.
   * @param value the value to set.
   */
  public void setMailFields(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.mailFields = value;
  }

  /**
   * Gets the value of the 'body' field.
   */
  public java.lang.CharSequence getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * @param value the value to set.
   */
  public void setBody(java.lang.CharSequence value) {
    this.body = value;
  }

  /**
   * Gets the value of the 'attachments' field.
   */
  public java.util.List<com.uebercomputing.mailrecord.Attachment> getAttachments() {
    return attachments;
  }

  /**
   * Sets the value of the 'attachments' field.
   * @param value the value to set.
   */
  public void setAttachments(java.util.List<com.uebercomputing.mailrecord.Attachment> value) {
    this.attachments = value;
  }

  /** Creates a new MailRecord RecordBuilder */
  public static com.uebercomputing.mailrecord.MailRecord.Builder newBuilder() {
    return new com.uebercomputing.mailrecord.MailRecord.Builder();
  }
  
  /** Creates a new MailRecord RecordBuilder by copying an existing Builder */
  public static com.uebercomputing.mailrecord.MailRecord.Builder newBuilder(com.uebercomputing.mailrecord.MailRecord.Builder other) {
    return new com.uebercomputing.mailrecord.MailRecord.Builder(other);
  }
  
  /** Creates a new MailRecord RecordBuilder by copying an existing MailRecord instance */
  public static com.uebercomputing.mailrecord.MailRecord.Builder newBuilder(com.uebercomputing.mailrecord.MailRecord other) {
    return new com.uebercomputing.mailrecord.MailRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for MailRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MailRecord>
    implements org.apache.avro.data.RecordBuilder<MailRecord> {

    private java.lang.CharSequence uuid;
    private java.lang.CharSequence from;
    private java.util.List<java.lang.CharSequence> to;
    private java.util.List<java.lang.CharSequence> cc;
    private java.util.List<java.lang.CharSequence> bcc;
    private long dateUtcEpoch;
    private java.lang.CharSequence subject;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> mailFields;
    private java.lang.CharSequence body;
    private java.util.List<com.uebercomputing.mailrecord.Attachment> attachments;

    /** Creates a new Builder */
    private Builder() {
      super(com.uebercomputing.mailrecord.MailRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.uebercomputing.mailrecord.MailRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.to)) {
        this.to = data().deepCopy(fields()[2].schema(), other.to);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cc)) {
        this.cc = data().deepCopy(fields()[3].schema(), other.cc);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.bcc)) {
        this.bcc = data().deepCopy(fields()[4].schema(), other.bcc);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dateUtcEpoch)) {
        this.dateUtcEpoch = data().deepCopy(fields()[5].schema(), other.dateUtcEpoch);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.subject)) {
        this.subject = data().deepCopy(fields()[6].schema(), other.subject);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.mailFields)) {
        this.mailFields = data().deepCopy(fields()[7].schema(), other.mailFields);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.body)) {
        this.body = data().deepCopy(fields()[8].schema(), other.body);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.attachments)) {
        this.attachments = data().deepCopy(fields()[9].schema(), other.attachments);
        fieldSetFlags()[9] = true;
      }
    }
    
    /** Creates a Builder by copying an existing MailRecord instance */
    private Builder(com.uebercomputing.mailrecord.MailRecord other) {
            super(com.uebercomputing.mailrecord.MailRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.uuid)) {
        this.uuid = data().deepCopy(fields()[0].schema(), other.uuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.to)) {
        this.to = data().deepCopy(fields()[2].schema(), other.to);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cc)) {
        this.cc = data().deepCopy(fields()[3].schema(), other.cc);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.bcc)) {
        this.bcc = data().deepCopy(fields()[4].schema(), other.bcc);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dateUtcEpoch)) {
        this.dateUtcEpoch = data().deepCopy(fields()[5].schema(), other.dateUtcEpoch);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.subject)) {
        this.subject = data().deepCopy(fields()[6].schema(), other.subject);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.mailFields)) {
        this.mailFields = data().deepCopy(fields()[7].schema(), other.mailFields);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.body)) {
        this.body = data().deepCopy(fields()[8].schema(), other.body);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.attachments)) {
        this.attachments = data().deepCopy(fields()[9].schema(), other.attachments);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'uuid' field */
    public java.lang.CharSequence getUuid() {
      return uuid;
    }
    
    /** Sets the value of the 'uuid' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setUuid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.uuid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'uuid' field has been set */
    public boolean hasUuid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'uuid' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearUuid() {
      uuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'from' field */
    public java.lang.CharSequence getFrom() {
      return from;
    }
    
    /** Sets the value of the 'from' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setFrom(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.from = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'from' field has been set */
    public boolean hasFrom() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'from' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearFrom() {
      from = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'to' field */
    public java.util.List<java.lang.CharSequence> getTo() {
      return to;
    }
    
    /** Sets the value of the 'to' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setTo(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.to = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'to' field has been set */
    public boolean hasTo() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'to' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearTo() {
      to = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'cc' field */
    public java.util.List<java.lang.CharSequence> getCc() {
      return cc;
    }
    
    /** Sets the value of the 'cc' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setCc(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.cc = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'cc' field has been set */
    public boolean hasCc() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'cc' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearCc() {
      cc = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'bcc' field */
    public java.util.List<java.lang.CharSequence> getBcc() {
      return bcc;
    }
    
    /** Sets the value of the 'bcc' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setBcc(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.bcc = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'bcc' field has been set */
    public boolean hasBcc() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'bcc' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearBcc() {
      bcc = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'dateUtcEpoch' field */
    public java.lang.Long getDateUtcEpoch() {
      return dateUtcEpoch;
    }
    
    /** Sets the value of the 'dateUtcEpoch' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setDateUtcEpoch(long value) {
      validate(fields()[5], value);
      this.dateUtcEpoch = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'dateUtcEpoch' field has been set */
    public boolean hasDateUtcEpoch() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'dateUtcEpoch' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearDateUtcEpoch() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'subject' field */
    public java.lang.CharSequence getSubject() {
      return subject;
    }
    
    /** Sets the value of the 'subject' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setSubject(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.subject = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'subject' field has been set */
    public boolean hasSubject() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'subject' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearSubject() {
      subject = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'mailFields' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getMailFields() {
      return mailFields;
    }
    
    /** Sets the value of the 'mailFields' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setMailFields(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[7], value);
      this.mailFields = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'mailFields' field has been set */
    public boolean hasMailFields() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'mailFields' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearMailFields() {
      mailFields = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'body' field */
    public java.lang.CharSequence getBody() {
      return body;
    }
    
    /** Sets the value of the 'body' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setBody(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.body = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'body' field has been set */
    public boolean hasBody() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'body' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearBody() {
      body = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'attachments' field */
    public java.util.List<com.uebercomputing.mailrecord.Attachment> getAttachments() {
      return attachments;
    }
    
    /** Sets the value of the 'attachments' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder setAttachments(java.util.List<com.uebercomputing.mailrecord.Attachment> value) {
      validate(fields()[9], value);
      this.attachments = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'attachments' field has been set */
    public boolean hasAttachments() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'attachments' field */
    public com.uebercomputing.mailrecord.MailRecord.Builder clearAttachments() {
      attachments = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public MailRecord build() {
      try {
        MailRecord record = new MailRecord();
        record.uuid = fieldSetFlags()[0] ? this.uuid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.from = fieldSetFlags()[1] ? this.from : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.to = fieldSetFlags()[2] ? this.to : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.cc = fieldSetFlags()[3] ? this.cc : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.bcc = fieldSetFlags()[4] ? this.bcc : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.dateUtcEpoch = fieldSetFlags()[5] ? this.dateUtcEpoch : (java.lang.Long) defaultValue(fields()[5]);
        record.subject = fieldSetFlags()[6] ? this.subject : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.mailFields = fieldSetFlags()[7] ? this.mailFields : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[7]);
        record.body = fieldSetFlags()[8] ? this.body : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.attachments = fieldSetFlags()[9] ? this.attachments : (java.util.List<com.uebercomputing.mailrecord.Attachment>) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
