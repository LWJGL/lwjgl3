/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.XR10.*;

/**
 * Structure specifying application info.
 * 
 * <h5>Description</h5>
 * 
 * <p>Useful values for {@code apiVersion} include {@link XR10#XR_API_VERSION_1_0 API_VERSION_1_0} and {@link XR11#XR_API_VERSION_1_1 API_VERSION_1_1}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code applicationName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link XR10#XR_MAX_APPLICATION_NAME_SIZE MAX_APPLICATION_NAME_SIZE}</li>
 * <li>{@code engineName} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to {@link XR10#XR_MAX_ENGINE_NAME_SIZE MAX_ENGINE_NAME_SIZE}</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When using the OpenXR API to implement a reusable engine that will be used by many applications, {@code engineName} <b>should</b> be set to a unique string that identifies the engine, and {@code engineVersion} <b>should</b> encode a representation of the engine’s version. This way, all applications that share this engine version will provide the same {@code engineName} and {@code engineVersion} to the runtime. The engine <b>should</b> then enable individual applications to choose their specific {@code applicationName} and {@code applicationVersion}, enabling one application to be distinguished from another application.</p>
 * 
 * <p>When using the OpenXR API to implement an individual application without a shared engine, the input {@code engineName} <b>should</b> be left empty and {@code engineVersion} <b>should</b> be set to 0. The {@code applicationName} <b>should</b> then be filled in with a unique string that identifies the app and the {@code applicationVersion} <b>should</b> encode a representation of the application’s version.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#XR_API_VERSION_1_0 API_VERSION_1_0}, {@link XR11#XR_API_VERSION_1_1 API_VERSION_1_1}, {@link XrInstanceCreateInfo}, {@link XR10#xrCreateInstance CreateInstance}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrApplicationInfo {
 *     char {@link #applicationName}[XR_MAX_APPLICATION_NAME_SIZE];
 *     uint32_t {@link #applicationVersion};
 *     char {@link #engineName}[XR_MAX_ENGINE_NAME_SIZE];
 *     uint32_t {@link #engineVersion};
 *     XrVersion {@link #apiVersion};
 * }</code></pre>
 */
public class XrApplicationInfo extends Struct<XrApplicationInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        APPLICATIONNAME,
        APPLICATIONVERSION,
        ENGINENAME,
        ENGINEVERSION,
        APIVERSION;

    static {
        Layout layout = __struct(
            __array(1, XR_MAX_APPLICATION_NAME_SIZE),
            __member(4),
            __array(1, XR_MAX_ENGINE_NAME_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        APPLICATIONNAME = layout.offsetof(0);
        APPLICATIONVERSION = layout.offsetof(1);
        ENGINENAME = layout.offsetof(2);
        ENGINEVERSION = layout.offsetof(3);
        APIVERSION = layout.offsetof(4);
    }

    protected XrApplicationInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrApplicationInfo create(long address, @Nullable ByteBuffer container) {
        return new XrApplicationInfo(address, container);
    }

    /**
     * Creates a {@code XrApplicationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrApplicationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a non-empty string containing the name of the application. */
    @NativeType("char[XR_MAX_APPLICATION_NAME_SIZE]")
    public ByteBuffer applicationName() { return napplicationName(address()); }
    /** a non-empty string containing the name of the application. */
    @NativeType("char[XR_MAX_APPLICATION_NAME_SIZE]")
    public String applicationNameString() { return napplicationNameString(address()); }
    /** an unsigned integer variable containing the developer-supplied version number of the application. */
    @NativeType("uint32_t")
    public int applicationVersion() { return napplicationVersion(address()); }
    /** a string containing the name of the engine (if any) used to create the application. It may be empty to indicate no specified engine. */
    @NativeType("char[XR_MAX_ENGINE_NAME_SIZE]")
    public ByteBuffer engineName() { return nengineName(address()); }
    /** a string containing the name of the engine (if any) used to create the application. It may be empty to indicate no specified engine. */
    @NativeType("char[XR_MAX_ENGINE_NAME_SIZE]")
    public String engineNameString() { return nengineNameString(address()); }
    /** an unsigned integer variable containing the developer-supplied version number of the engine used to create the application. May be zero to indicate no specified engine. */
    @NativeType("uint32_t")
    public int engineVersion() { return nengineVersion(address()); }
    /** the version of this API against which the application will run, encoded as described in the <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#fundamentals-api-version-numbers-and-semantics">API Version Numbers and Semantics</a> section. If the runtime does not support the requested {@code apiVersion} it <b>must</b> return {@link XR10#XR_ERROR_API_VERSION_UNSUPPORTED ERROR_API_VERSION_UNSUPPORTED}. */
    @NativeType("XrVersion")
    public long apiVersion() { return napiVersion(address()); }

    /** Copies the specified encoded string to the {@link #applicationName} field. */
    public XrApplicationInfo applicationName(@NativeType("char[XR_MAX_APPLICATION_NAME_SIZE]") ByteBuffer value) { napplicationName(address(), value); return this; }
    /** Sets the specified value to the {@link #applicationVersion} field. */
    public XrApplicationInfo applicationVersion(@NativeType("uint32_t") int value) { napplicationVersion(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #engineName} field. */
    public XrApplicationInfo engineName(@NativeType("char[XR_MAX_ENGINE_NAME_SIZE]") ByteBuffer value) { nengineName(address(), value); return this; }
    /** Sets the specified value to the {@link #engineVersion} field. */
    public XrApplicationInfo engineVersion(@NativeType("uint32_t") int value) { nengineVersion(address(), value); return this; }
    /** Sets the specified value to the {@link #apiVersion} field. */
    public XrApplicationInfo apiVersion(@NativeType("XrVersion") long value) { napiVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrApplicationInfo set(
        ByteBuffer applicationName,
        int applicationVersion,
        ByteBuffer engineName,
        int engineVersion,
        long apiVersion
    ) {
        applicationName(applicationName);
        applicationVersion(applicationVersion);
        engineName(engineName);
        engineVersion(engineVersion);
        apiVersion(apiVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrApplicationInfo set(XrApplicationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrApplicationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrApplicationInfo malloc() {
        return new XrApplicationInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrApplicationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrApplicationInfo calloc() {
        return new XrApplicationInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrApplicationInfo} instance allocated with {@link BufferUtils}. */
    public static XrApplicationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrApplicationInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrApplicationInfo} instance for the specified memory address. */
    public static XrApplicationInfo create(long address) {
        return new XrApplicationInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrApplicationInfo createSafe(long address) {
        return address == NULL ? null : new XrApplicationInfo(address, null);
    }

    /**
     * Returns a new {@link XrApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrApplicationInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrApplicationInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrApplicationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrApplicationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrApplicationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrApplicationInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrApplicationInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrApplicationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrApplicationInfo malloc(MemoryStack stack) {
        return new XrApplicationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrApplicationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrApplicationInfo calloc(MemoryStack stack) {
        return new XrApplicationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrApplicationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrApplicationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #applicationName}. */
    public static ByteBuffer napplicationName(long struct) { return memByteBuffer(struct + XrApplicationInfo.APPLICATIONNAME, XR_MAX_APPLICATION_NAME_SIZE); }
    /** Unsafe version of {@link #applicationNameString}. */
    public static String napplicationNameString(long struct) { return memUTF8(struct + XrApplicationInfo.APPLICATIONNAME); }
    /** Unsafe version of {@link #applicationVersion}. */
    public static int napplicationVersion(long struct) { return memGetInt(struct + XrApplicationInfo.APPLICATIONVERSION); }
    /** Unsafe version of {@link #engineName}. */
    public static ByteBuffer nengineName(long struct) { return memByteBuffer(struct + XrApplicationInfo.ENGINENAME, XR_MAX_ENGINE_NAME_SIZE); }
    /** Unsafe version of {@link #engineNameString}. */
    public static String nengineNameString(long struct) { return memUTF8(struct + XrApplicationInfo.ENGINENAME); }
    /** Unsafe version of {@link #engineVersion}. */
    public static int nengineVersion(long struct) { return memGetInt(struct + XrApplicationInfo.ENGINEVERSION); }
    /** Unsafe version of {@link #apiVersion}. */
    public static long napiVersion(long struct) { return memGetLong(struct + XrApplicationInfo.APIVERSION); }

    /** Unsafe version of {@link #applicationName(ByteBuffer) applicationName}. */
    public static void napplicationName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_APPLICATION_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrApplicationInfo.APPLICATIONNAME, value.remaining());
    }
    /** Unsafe version of {@link #applicationVersion(int) applicationVersion}. */
    public static void napplicationVersion(long struct, int value) { memPutInt(struct + XrApplicationInfo.APPLICATIONVERSION, value); }
    /** Unsafe version of {@link #engineName(ByteBuffer) engineName}. */
    public static void nengineName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, XR_MAX_ENGINE_NAME_SIZE);
        }
        memCopy(memAddress(value), struct + XrApplicationInfo.ENGINENAME, value.remaining());
    }
    /** Unsafe version of {@link #engineVersion(int) engineVersion}. */
    public static void nengineVersion(long struct, int value) { memPutInt(struct + XrApplicationInfo.ENGINEVERSION, value); }
    /** Unsafe version of {@link #apiVersion(long) apiVersion}. */
    public static void napiVersion(long struct, long value) { memPutLong(struct + XrApplicationInfo.APIVERSION, value); }

    // -----------------------------------

    /** An array of {@link XrApplicationInfo} structs. */
    public static class Buffer extends StructBuffer<XrApplicationInfo, Buffer> implements NativeResource {

        private static final XrApplicationInfo ELEMENT_FACTORY = XrApplicationInfo.create(-1L);

        /**
         * Creates a new {@code XrApplicationInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrApplicationInfo#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrApplicationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link XrApplicationInfo#applicationName} field. */
        @NativeType("char[XR_MAX_APPLICATION_NAME_SIZE]")
        public ByteBuffer applicationName() { return XrApplicationInfo.napplicationName(address()); }
        /** @return the null-terminated string stored in the {@link XrApplicationInfo#applicationName} field. */
        @NativeType("char[XR_MAX_APPLICATION_NAME_SIZE]")
        public String applicationNameString() { return XrApplicationInfo.napplicationNameString(address()); }
        /** @return the value of the {@link XrApplicationInfo#applicationVersion} field. */
        @NativeType("uint32_t")
        public int applicationVersion() { return XrApplicationInfo.napplicationVersion(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrApplicationInfo#engineName} field. */
        @NativeType("char[XR_MAX_ENGINE_NAME_SIZE]")
        public ByteBuffer engineName() { return XrApplicationInfo.nengineName(address()); }
        /** @return the null-terminated string stored in the {@link XrApplicationInfo#engineName} field. */
        @NativeType("char[XR_MAX_ENGINE_NAME_SIZE]")
        public String engineNameString() { return XrApplicationInfo.nengineNameString(address()); }
        /** @return the value of the {@link XrApplicationInfo#engineVersion} field. */
        @NativeType("uint32_t")
        public int engineVersion() { return XrApplicationInfo.nengineVersion(address()); }
        /** @return the value of the {@link XrApplicationInfo#apiVersion} field. */
        @NativeType("XrVersion")
        public long apiVersion() { return XrApplicationInfo.napiVersion(address()); }

        /** Copies the specified encoded string to the {@link XrApplicationInfo#applicationName} field. */
        public XrApplicationInfo.Buffer applicationName(@NativeType("char[XR_MAX_APPLICATION_NAME_SIZE]") ByteBuffer value) { XrApplicationInfo.napplicationName(address(), value); return this; }
        /** Sets the specified value to the {@link XrApplicationInfo#applicationVersion} field. */
        public XrApplicationInfo.Buffer applicationVersion(@NativeType("uint32_t") int value) { XrApplicationInfo.napplicationVersion(address(), value); return this; }
        /** Copies the specified encoded string to the {@link XrApplicationInfo#engineName} field. */
        public XrApplicationInfo.Buffer engineName(@NativeType("char[XR_MAX_ENGINE_NAME_SIZE]") ByteBuffer value) { XrApplicationInfo.nengineName(address(), value); return this; }
        /** Sets the specified value to the {@link XrApplicationInfo#engineVersion} field. */
        public XrApplicationInfo.Buffer engineVersion(@NativeType("uint32_t") int value) { XrApplicationInfo.nengineVersion(address(), value); return this; }
        /** Sets the specified value to the {@link XrApplicationInfo#apiVersion} field. */
        public XrApplicationInfo.Buffer apiVersion(@NativeType("XrVersion") long value) { XrApplicationInfo.napiVersion(address(), value); return this; }

    }

}