/* AUTO-GENERATED FILE. DO NOT MODIFY.
 * This class was automatically generated by the
 * static binding generator from the resources it found.
 * Please do not modify by hand.
 */
package com.tns.gen.java.lang;

public class Object_vendor_15296_28_ManualValidationProviderImpl extends java.lang.Object
    implements com.tns.NativeScriptHashCodeProvider,
        com.telerik.widget.dataform.engine.PropertyValidatorManual.ValidationProvider {
  public Object_vendor_15296_28_ManualValidationProviderImpl() {
    super();
    com.tns.Runtime.initInstance(this);
  }

  public boolean validate(java.lang.Object param_0, java.lang.String param_1) {
    java.lang.Object[] args = new java.lang.Object[2];
    args[0] = param_0;
    args[1] = param_1;
    return (boolean) com.tns.Runtime.callJSMethod(this, "validate", boolean.class, args);
  }

  public int hashCode__super() {
    return super.hashCode();
  }

  public boolean equals__super(java.lang.Object other) {
    return super.equals(other);
  }
}
