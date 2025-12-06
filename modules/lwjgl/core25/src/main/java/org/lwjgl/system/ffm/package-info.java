/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
/**
 * Experimental FFM-based binding generation at runtime.
 *
 * <p>The objective is to allow users to create their own LWJGL-style bindings, using a fluent API, dynamically at run-time, without sacrificing performance or
 * worrying about best practices and low-level details.</p>
 *
 * <p>Several modern Java technologies are being utilized to achieve this:</p>
 * <ul>
 *     <li>Dynamic Class-File Constants (JEP 309, JDK 11, a.k.a. Condy): Used to lazily initialize bindings, without precompiling a private nested class per function.</li>
 *     <li>Hidden Classes (JEP 371, JDK 15): Used to generate classes with minimal metadata and no interaction with ClassLoaders.</li>
 *     <li>Class data support for hidden classes (JDK-8256214, JDK 16): Used to boostrap Condy values.</li>
 *     <li>Foreign Function & Memory API (JEP 442, JDK 22): Used for native interoperation without JNI.</li>
 *     <li>Class-File API (JEP 457, JDK 24): Used to generate bytecode at runtime, without 3rd-party dependencies.</li>
 * </ul>
 *
 * <p>The {@link org.lwjgl.system.ffm.FFM#ffmGenerate} method is designed to be relatively cheap. The instance returned is lightweight and its methods are
 * never materialized, unless actually used by the application. More specifically:</p>
 * <ul>
 *    <li>A minimal class is generated that implements the input interface.</li>
 *    <li>There is no state in the generated class, only methods.</li>
 *    <li>All methods are simple, with minimal bytecode. A method handle is retrieved using Condy and arguments are passed directly to {@link java.lang.invoke.MethodHandle#invokeExact}.</li>
 *    <li>There is no overhead from the Condy {@code ldc} instruction. It is executed only once, if and when the method is called.</li>
 *    <li>
 *        Execution of relatively expensive binding code is deferred to the Condy bootstrap. This includes:
 *        <ul>
 *            <li>lookup of {@code FFM*} annotations and associated logic</li>
 *            <li>function address lookup and creation of FFM method handles</li>
 *            <li>further bytecode generation and wrapping of FFM method handles if necessary</li>
 *        </ul>
 *    </li>
 *    <li>
 *        Hidden class data is used:
 *        <ul>
 *            <li>to pass reflected {@link java.lang.reflect.Method} instances to the Condy bootstrap</li>
 *            <li>to pass FFM {@link java.lang.invoke.MethodHandle}/{@link java.lang.foreign.MemorySegment} instances to generated wrapper methods</li>
 *        </ul>
 *    </li>
 * </ul>
 *
 * <p>When stored in {@code static final} fields, performance of the generated bindings is equivalent to direct FFM calls. The JVM can inline through
 * everything, for the following reasons:</p>
 * <ul>
 *     <li>The binding instance is constant.</li>
 *     <li>There is a single implementation of the binding interface.</li>
 *     <li>The {@code MethodHandle} instances created via Condy are also treated as constants by the JVM.</li>
 * </ul>
 *
 * <p>Downcalls support the specification of 3 virtual parameters, which must be present in a strict order before other parameters:</p>
 * <ul>
 *     <li>
 *         A {@code MemorySegment} parameter in methods annotated with {@link org.lwjgl.system.ffm.FFMFunctionAddress}.
 *
 *         <p>It must be specified before any other virtual or normal parameter.</p>
 *     </li>
 *     <li>
 *         A {@link java.lang.foreign.SegmentAllocator} or {@link org.lwjgl.system.ffm.StackAllocator} parameter. This parameter will be used to allocate storage for struct values passed or returned
 *         by-value and also for temporary storage needed internally by the method call (e.g. for {@link org.lwjgl.system.ffm.FFMReturn} buffers).
 *
 *         <p>If the parameter is of type {@code StackAllocator}, a stack frame will be pushed & popped inside the method call when temporary storage is
 *         needed.</p>
 *
 *         <p>It must be specified after the {@code FFMFunctionAddress} parameter, if one exists, and before any other virtual or normal parameter.</p>
 *     </li>
 *     <li>
 *         A {@code MemorySegment} parameter annotated with {@link org.lwjgl.system.ffm.FFMCaptureCallState}.
 *
 *         <p>It must be specified after other virtual parameters and before any normal parameters.</p>
 *     </li>
 * </ul>
 *
 * <p>Upcalls and structs/unions are also supported. They are also defined as interfaces ({@link java.lang.FunctionalInterface} in the case of upcalls), but there are
 * two classes generated:</p>
 * <ul>
 *     <li>The upcall or struct/union implementation itself.</li>
 *     <li>A binder implementation, which is used to allocate and access the corresponding type. The binder instance must be declared as a field in the
 *     interface and functions like a factory API for the type.</li>
 * </ul>
 * <p>See {@link org.lwjgl.system.ffm.UpcallBinder} and {@link org.lwjgl.system.ffm.GroupBinder} for details.</p>
 */
@NullMarked
package org.lwjgl.system.ffm;

import org.jspecify.annotations.*;