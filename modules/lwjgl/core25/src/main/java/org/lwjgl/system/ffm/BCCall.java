/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import org.lwjgl.system.*;

import java.lang.classfile.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.reflect.*;
import java.util.stream.*;

import static java.lang.constant.ConstantDescs.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;

abstract sealed class BCCall
    permits BCCallDown, BCCallUp {

    protected static final boolean BITS32 = ValueLayout.ADDRESS.byteSize() == 4;

    protected final FFMConfig config;

    BCCall(FFMConfig config) {
        this.config = config;
    }

    protected static ClassDesc getClassDescWrapper(Method method) {
        var declaringClass = method.getDeclaringClass();
        return ClassDesc.of(
            declaringClass.getPackageName(),
            declaringClass.getSimpleName() + "$" + method.getName() // TODO: do we need to handle multiple overloads?
        );
    }

    protected boolean needsBinder(Class<?> type) {
        if (!type.isInterface()) {
            return false;
        }

        if (MemorySegment.class.isAssignableFrom(type)) {
            return false;
        }

        FFM.lookupBinder(config, type);
        return true;
    }

    protected static void boxPrimitiveValue(CodeBuilder cb, TypeKind tk) {
        switch (tk) {
            case BOOLEAN -> cb.invokestatic(CD_Boolean, "valueOf", MTD_Boolean_valueOf);
            case BYTE -> cb.invokestatic(CD_Byte, "valueOf", MTD_Byte_valueOf);
            case SHORT -> cb.invokestatic(CD_Short, "valueOf", MTD_Short_valueOf);
            case INT -> cb.invokestatic(CD_Integer, "valueOf", MTD_Integer_valueOf);
            case LONG -> cb.invokestatic(CD_Long, "valueOf", MTD_Long_valueOf);
            case FLOAT -> cb.invokestatic(CD_Float, "valueOf", MTD_Float_valueOf);
            case DOUBLE -> cb.invokestatic(CD_Double, "valueOf", MTD_Double_valueOf);
            default -> throw new UnsupportedOperationException("Unsupported primitive type: " + tk);
        }
    }

    protected static MemoryLayout valueLayout(Parameter parameter) { return valueLayout(parameter, parameter.getType()); }
    protected static MemoryLayout valueLayout(AnnotatedElement element, Class<?> type) {
        if (type == String.class) {
            return FFM.C_POINTER;
        } else if (type == MemorySegment.class) {
            return ValueLayout.ADDRESS;
        } else if (type == boolean.class) {
            var booleanInt = element.getAnnotation(FFMBooleanInt.class);
            if (booleanInt != null) {
                return booleanInt.value().layout;
            }
            return ValueLayout.JAVA_BOOLEAN;
        } else if (type == byte.class) {
            return ValueLayout.JAVA_BYTE;
        } else if (type == short.class) {
            return ValueLayout.JAVA_SHORT;
        } else if (type == int.class) {
            return ValueLayout.JAVA_INT;
        } else if (type == long.class) {
            return BITS32 && element.isAnnotationPresent(FFMPointer.class)
                ? ValueLayout.JAVA_INT
                : ValueLayout.JAVA_LONG;
        } else if (type == float.class) {
            return ValueLayout.JAVA_FLOAT;
        } else if (type == double.class) {
            return ValueLayout.JAVA_DOUBLE;
        }
        throw new IllegalArgumentException("Unsupported type: " + type);
    }

    protected static void printDebug(Method method, Parameter[] parameters, FunctionDescriptor descriptor) {
        apiLog("\t-> J: " + method.getReturnType() + ' ' + method.getName() + '(' + Stream.of(parameters).map(it -> it.getType().getSimpleName()).collect(Collectors.joining(", ")) + ')');
        var signature = method.getAnnotation(FFMDefinition.class);
        if (signature != null) {
            apiLog("\t-> S: " + signature.value());
        }
        apiLog("\t-> N: " + descriptor);
    }

    enum FeatureFlag {
        /** Needs tracing */
        FF_TRACING,
        /** Needs a check */
        FF_CHECK,
        /** Needs a new stack frame */
        FF_STACK,
        /** Has struct/union/upcall type */
        FF_BINDER,
        /** Returns group by value */
        FF_BY_VALUE,
        /** Needs a type conversion (string, i2b/b2i, raw pointer on 32-bit system) */
        FF_TYPE_CONVERSION,
        /** Need to pass 2 leading NULL arguments */
        FF_JNI,

        /** Sentinel */
        FF_LAST;

        final int mask;

        FeatureFlag() {
            this.mask = 1 << this.ordinal();
        }

        public boolean isSet(int flags) {
            return (flags & mask) != 0;
        }
    }

}
