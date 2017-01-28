/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.system.tinycc;

import javassist.ClassPool;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.ClassFile;
import javassist.bytecode.MethodInfo;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.*;
import org.lwjgl.system.jni.JNINativeMethod;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.stream.*;

import static org.lwjgl.system.JNITinyHeader.prependJNIHeader;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.tinycc.TinyCC.*;

public class NativeMethodHandle implements NativeResource {

	public enum Mode {
		EXPLICIT {
			@Override
			String getFunctionAddress(long ptr) { return "\tFuncPROC func = (FuncPROC)(intptr_t)arg0;\n"; }
		},
		THREAD_LOCAL {
			@Override
			String getFunctionAddress(long ptr) { return "\tFuncPROC func = (FuncPROC)(intptr_t)((void **)(*__env)->reserved3)[" + ptr + "];\n"; }
		},
		EXTERN {
			@Override
			String getFunctionAddress(long ptr) { return ""; }
		};

		abstract String getFunctionAddress(long ptr);
	}

	public enum CallConvention {
		DEFAULT(""),
		STDCALL("__stdcall ");

		final String modifier;

		CallConvention(String modifier) {
			this.modifier = modifier;
		}
	}

	public static NativeMethodHandle create(Mode mode, Class<?> rtype, Class<?>... ptypes) {
		return create(mode, CallConvention.DEFAULT, rtype, ptypes);
	}

	public static NativeMethodHandle create(Mode mode, CallConvention callConvention, Class<?> rtype, Class<?>... ptypes) {
		return create(mode, callConvention, NULL, rtype, ptypes);
	}

	public static NativeMethodHandle create(Mode mode, CallConvention callConvention, long ptr, Class<?> rtype, Class<?>... ptypes) {
		switch ( mode ) {
			case EXPLICIT:
				if ( ptr != NULL )
					throw new IllegalArgumentException();
				break;
			case THREAD_LOCAL:
				if ( ptr < 0L || Integer.MAX_VALUE < ptr )
					throw new IllegalArgumentException();
				break;
			case EXTERN:
				if ( ptr == NULL )
					throw new IllegalArgumentException();
				break;
		}

		try {
			return new NativeMethodHandle(
				mode,
				callConvention == CallConvention.STDCALL && Pointer.BITS64 ? CallConvention.DEFAULT : callConvention,
				ptr,
				rtype, ptypes
			);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private final long tcc;

	private final long call;

	private final MethodHandle handle;

	private NativeMethodHandle(Mode mode, CallConvention callConvention, long ptr, Class<?> rtype, Class<?>... ptypes) throws Exception {
		Class<?>[] ptypesJNI;
		if ( mode == Mode.EXPLICIT ) {
			ptypesJNI = new Class<?>[ptypes.length + 1];
			ptypesJNI[0] = long.class;
			System.arraycopy(ptypes, 0, ptypesJNI, 1, ptypes.length);
		} else
			ptypesJNI = ptypes;

		tcc = tcc_new();

		tcc_set_options(tcc, "-nostdinc -nostdlib");
		tcc_set_output_type(tcc, TCC_OUTPUT_MEMORY);

		int poffset = mode == Mode.EXPLICIT ? 1 : 0;
		String source = "" +
			"typedef void (" + callConvention.modifier + "*FuncPROC) (" + Stream.of(ptypes)
			.map(NativeMethodHandle::getNativeType)
			.collect(Collectors.joining(", ")) + ");\n" +
			(mode == Mode.EXTERN ? "extern FuncPROC func;\n" : "") +
			"\n" +
			"JNIEXPORT void JNICALL call(JNIEnv *__env, jclass clazz" + IntStream.range(0, ptypesJNI.length)
			.mapToObj(i -> getNativeType(ptypesJNI[i]) + " arg" + i)
			.collect(Collectors.joining(", ", ptypesJNI.length == 0 ? "" : ", ", "")) + ") {\n" +
			mode.getFunctionAddress(ptr) +
			"\tfunc(" + IntStream.range(poffset, ptypes.length + poffset)
			.mapToObj(i -> "arg" + i)
			.collect(Collectors.joining(", ")) + ");\n" +
			"}\n";

		System.out.print(source);
		try ( MemoryStack stack = stackPush() ) {
			if ( tcc_compile_string(tcc, prependJNIHeader(source, stack)) == -1 )
				throw new IllegalStateException("Compilation failed.");
		}

		if ( mode == Mode.EXTERN )
			tcc_add_symbol(tcc, "func", ptr);

		if ( tcc_relocate(tcc, TCC_RELOCATE_AUTO) == -1 )
			throw new IllegalStateException("Relocation failed.");

		call = tcc_get_symbol(tcc, getJNISymbol("call", ptypesJNI));
		if ( call == NULL )
			throw new IllegalStateException("Failed to retrieve JNI function pointer.");

		String className = "JNI" + callConvention.name() + mode.ordinal() + '$' + Stream.of(ptypesJNI)
			.map(NativeMethodHandle::getJNISignature)
			.collect(Collectors.joining()) + '$' + getJNISignature(rtype);

		try ( MemoryStack stack = stackPush() ) {
			JNINativeMethod.Buffer methods = JNINativeMethod.calloc(1);
			methods.get(0)
				.name(stack.UTF8("call"))
				.signature(stack.UTF8(getJNISignature(mode, rtype, ptypesJNI)))
				.fnPtr(call);

			ClassFile cf = new ClassFile(false, "org.lwjgl.system." + className, null);
			cf.setMajorVersion(52);
			cf.setMinorVersion(0);
			cf.setAccessFlags(AccessFlag.PUBLIC | AccessFlag.FINAL);

			MethodInfo m = new MethodInfo(cf.getConstPool(), "call", getJNISignature(mode, rtype, ptypesJNI));
			m.setAccessFlags(AccessFlag.PUBLIC | AccessFlag.STATIC | AccessFlag.NATIVE);
			cf.addMethod(m);

			Class<?> clazz = ClassPool.getDefault().makeClass(cf).toClass();

			if ( RegisterNatives(FindClass("org/lwjgl/system/" + className), methods) != 0 )
				throw new IllegalStateException("Failed to register JNI natives");

			handle = MethodHandles
				.publicLookup()
				.findStatic(clazz, "call", MethodType.methodType(rtype, ptypesJNI));
		}
	}

	public long getCall() {
		return call;
	}

	public MethodHandle getHandle() {
		return handle;
	}

	@Override
	public void free() {
		tcc_delete(tcc);
	}

	private static String getJNISignature(Mode mode, Class<?> rtype, Class<?>... ptypes) {
		StringBuilder builder = new StringBuilder(16)
			.append('(');

		for ( Class<?> ptype : ptypes )
			builder.append(getJNISignature(ptype));

		return builder
			.append(')')
			.append(getJNISignature(rtype))
			.toString();
	}

	private static String getJNISignature(Class<?> type) {
		if ( type == void.class )
			return "V";

		if ( type == int.class )
			return "I";

		if ( type == long.class )
			return "J";

		throw new IllegalArgumentException(type.toString());
	}

	private static String getNativeType(Class<?> type) {
		if ( type == void.class )
			return "void";

		if ( type == int.class )
			return "jint";

		if ( type == long.class )
			return "jlong";

		throw new IllegalArgumentException(type.toString());
	}

	private static int getBytes(Class<?> type) {
		if ( type == int.class )
			return 4;

		if ( type == long.class )
			return 8;

		throw new IllegalArgumentException(type.toString());
	}

	public static String getJNISymbol(String name, Class<?>... ptypes) {
		if ( Platform.get() != Platform.WINDOWS || Pointer.BITS64 )
			return name;

		return '_' + name + '@' + (Pointer.POINTER_SIZE * 2 + Stream.of(ptypes)
			.mapToInt(NativeMethodHandle::getBytes)
			.sum());
	}

}