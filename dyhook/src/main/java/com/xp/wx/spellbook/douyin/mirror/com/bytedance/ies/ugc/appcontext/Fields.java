package com.xp.wx.spellbook.douyin.mirror.com.bytedance.ies.ugc.appcontext;

import com.xp.wx.spellbook.douyin.DyGlobal;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/bytedance/ies/ugc/appcontext/Fields;", "", "()V", "ClassAppContextManager_INSTANCE", "Ljava/lang/reflect/Field;", "getClassAppContextManager_INSTANCE", "()Ljava/lang/reflect/Field;", "ClassAppContextManager_INSTANCE$delegate", "Lkotlin/Lazy;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Fields.kt */
public final class Fields {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Fields.class), "ClassAppContextManager_INSTANCE", "getClassAppContextManager_INSTANCE()Ljava/lang/reflect/Field;"))};
    private static final Lazy ClassAppContextManager_INSTANCE$delegate;
    public static final Fields INSTANCE = new Fields();

    public final Field getClassAppContextManager_INSTANCE() {
        Lazy lazy = ClassAppContextManager_INSTANCE$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Field) lazy.getValue();
    }

    static {
        Lazy lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Fields$$special$$inlined$dyLazy$1("ClassAppContextManager_INSTANCE"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Fields$$special$$inlined$dyLazy$2("ClassAppContextManager_INSTANCE"));
        }
        ClassAppContextManager_INSTANCE$delegate = lazy;
    }

    private Fields() {
    }
}