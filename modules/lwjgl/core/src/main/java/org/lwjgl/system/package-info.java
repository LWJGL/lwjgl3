/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

/**
 * Contains implementation details and platform-specific functionality required to make LWJGL work. Unlike other packages, this package and its sub-packages
 * make no guarantees of forward compatibility. Any public API contained here may change between releases and revisions.
 *
 * <p>In more detail, this package contains the following:</p>
 * <ul>
 * <li>Functionality required for loading native shared libraries (the LWJGL JNI code, as well as 3rd-party libraries) and invoking native functions.</li>
 * <li>Functionality required for efficiently accessing and managing off-heap memory.</li>
 * <li>Platform and operating system specific API bindings.</li>
 * <li>The libffi bindings, used for implementing native function callbacks via Java code.</li>
 * <li>Miscellaneous bindings for advanced users, or bindings that are not proven to be generally useful yet.</li>
 * <li>Functionality used internally by API bindings. This functionality is unfortunately public, as it is shared by all bindings.</li>
 * </ul>
 *
 * <p>Even though this package is reserved for breaking changes, some of the above functionality may be very useful to advanced users. For this to be practical,
 * the API of certain interfaces and classes will remain as stable as possible. This affects the following classes:</p>
 * <ul>
 * <li>{@link org.lwjgl.system.MemoryUtil MemoryUtil}, used for off-heap data access and memory allocation/deallocation.</li>
 * <li>{@link org.lwjgl.system.MemoryStack MemoryStack}, used for emulated off-heap stack allocations.</li>
 * <li>{@link org.lwjgl.system.FunctionProvider FunctionProvider}, {@link org.lwjgl.system.Library Library} and
 * {@link org.lwjgl.system.SharedLibrary SharedLibrary}, used for loading shared libraries and accessing function pointers.</li>
 * <li>{@link org.lwjgl.system.Pointer Pointer}, used as off-heap resource abstractions.</li>
 * <li>{@link org.lwjgl.system.Configuration Configuration}, used for programmatic configuration at runtime.</li>
 * <li>{@link org.lwjgl.system.Struct Struct} and {@link org.lwjgl.system.StructBuffer StructBuffer}, the base classes for struct types and struct buffers.</li>
 * </ul>
 */
@NonnullDefault
package org.lwjgl.system;
