/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkApplicationInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     char const * pApplicationName;
 *     uint32_t applicationVersion;
 *     char const * pEngineName;
 *     uint32_t engineVersion;
 *     uint32_t apiVersion;
 * }}</pre>
 */
public class VkApplicationInfo extends Struct<VkApplicationInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PAPPLICATIONNAME,
        APPLICATIONVERSION,
        PENGINENAME,
        ENGINEVERSION,
        APIVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PAPPLICATIONNAME = layout.offsetof(2);
        APPLICATIONVERSION = layout.offsetof(3);
        PENGINENAME = layout.offsetof(4);
        ENGINEVERSION = layout.offsetof(5);
        APIVERSION = layout.offsetof(6);
    }

    protected VkApplicationInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkApplicationInfo create(long address, @Nullable ByteBuffer container) {
        return new VkApplicationInfo(address, container);
    }

    /**
     * Creates a {@code VkApplicationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkApplicationInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pApplicationName} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer pApplicationName() { return npApplicationName(address()); }
    /** @return the null-terminated string pointed to by the {@code pApplicationName} field. */
    @NativeType("char const *")
    public @Nullable String pApplicationNameString() { return npApplicationNameString(address()); }
    /** @return the value of the {@code applicationVersion} field. */
    @NativeType("uint32_t")
    public int applicationVersion() { return napplicationVersion(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pEngineName} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer pEngineName() { return npEngineName(address()); }
    /** @return the null-terminated string pointed to by the {@code pEngineName} field. */
    @NativeType("char const *")
    public @Nullable String pEngineNameString() { return npEngineNameString(address()); }
    /** @return the value of the {@code engineVersion} field. */
    @NativeType("uint32_t")
    public int engineVersion() { return nengineVersion(address()); }
    /** @return the value of the {@code apiVersion} field. */
    @NativeType("uint32_t")
    public int apiVersion() { return napiVersion(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkApplicationInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO} value to the {@code sType} field. */
    public VkApplicationInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkApplicationInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pApplicationName} field. */
    public VkApplicationInfo pApplicationName(@Nullable @NativeType("char const *") ByteBuffer value) { npApplicationName(address(), value); return this; }
    /** Sets the specified value to the {@code applicationVersion} field. */
    public VkApplicationInfo applicationVersion(@NativeType("uint32_t") int value) { napplicationVersion(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pEngineName} field. */
    public VkApplicationInfo pEngineName(@Nullable @NativeType("char const *") ByteBuffer value) { npEngineName(address(), value); return this; }
    /** Sets the specified value to the {@code engineVersion} field. */
    public VkApplicationInfo engineVersion(@NativeType("uint32_t") int value) { nengineVersion(address(), value); return this; }
    /** Sets the specified value to the {@code apiVersion} field. */
    public VkApplicationInfo apiVersion(@NativeType("uint32_t") int value) { napiVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkApplicationInfo set(
        int sType,
        long pNext,
        @Nullable ByteBuffer pApplicationName,
        int applicationVersion,
        @Nullable ByteBuffer pEngineName,
        int engineVersion,
        int apiVersion
    ) {
        sType(sType);
        pNext(pNext);
        pApplicationName(pApplicationName);
        applicationVersion(applicationVersion);
        pEngineName(pEngineName);
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
    public VkApplicationInfo set(VkApplicationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkApplicationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkApplicationInfo malloc() {
        return new VkApplicationInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkApplicationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkApplicationInfo calloc() {
        return new VkApplicationInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkApplicationInfo} instance allocated with {@link BufferUtils}. */
    public static VkApplicationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkApplicationInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkApplicationInfo} instance for the specified memory address. */
    public static VkApplicationInfo create(long address) {
        return new VkApplicationInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkApplicationInfo createSafe(long address) {
        return address == NULL ? null : new VkApplicationInfo(address, null);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkApplicationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkApplicationInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkApplicationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkApplicationInfo malloc(MemoryStack stack) {
        return new VkApplicationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkApplicationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkApplicationInfo calloc(MemoryStack stack) {
        return new VkApplicationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkApplicationInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkApplicationInfo.PNEXT); }
    /** Unsafe version of {@link #pApplicationName}. */
    public static @Nullable ByteBuffer npApplicationName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
    /** Unsafe version of {@link #pApplicationNameString}. */
    public static @Nullable String npApplicationNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
    /** Unsafe version of {@link #applicationVersion}. */
    public static int napplicationVersion(long struct) { return memGetInt(struct + VkApplicationInfo.APPLICATIONVERSION); }
    /** Unsafe version of {@link #pEngineName}. */
    public static @Nullable ByteBuffer npEngineName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
    /** Unsafe version of {@link #pEngineNameString}. */
    public static @Nullable String npEngineNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
    /** Unsafe version of {@link #engineVersion}. */
    public static int nengineVersion(long struct) { return memGetInt(struct + VkApplicationInfo.ENGINEVERSION); }
    /** Unsafe version of {@link #apiVersion}. */
    public static int napiVersion(long struct) { return memGetInt(struct + VkApplicationInfo.APIVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkApplicationInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkApplicationInfo.PNEXT, value); }
    /** Unsafe version of {@link #pApplicationName(ByteBuffer) pApplicationName}. */
    public static void npApplicationName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkApplicationInfo.PAPPLICATIONNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #applicationVersion(int) applicationVersion}. */
    public static void napplicationVersion(long struct, int value) { memPutInt(struct + VkApplicationInfo.APPLICATIONVERSION, value); }
    /** Unsafe version of {@link #pEngineName(ByteBuffer) pEngineName}. */
    public static void npEngineName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkApplicationInfo.PENGINENAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #engineVersion(int) engineVersion}. */
    public static void nengineVersion(long struct, int value) { memPutInt(struct + VkApplicationInfo.ENGINEVERSION, value); }
    /** Unsafe version of {@link #apiVersion(int) apiVersion}. */
    public static void napiVersion(long struct, int value) { memPutInt(struct + VkApplicationInfo.APIVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkApplicationInfo} structs. */
    public static class Buffer extends StructBuffer<VkApplicationInfo, Buffer> implements NativeResource {

        private static final VkApplicationInfo ELEMENT_FACTORY = VkApplicationInfo.create(-1L);

        /**
         * Creates a new {@code VkApplicationInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkApplicationInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkApplicationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkApplicationInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkApplicationInfo.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pApplicationName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pApplicationName() { return VkApplicationInfo.npApplicationName(address()); }
        /** @return the null-terminated string pointed to by the {@code pApplicationName} field. */
        @NativeType("char const *")
        public @Nullable String pApplicationNameString() { return VkApplicationInfo.npApplicationNameString(address()); }
        /** @return the value of the {@code applicationVersion} field. */
        @NativeType("uint32_t")
        public int applicationVersion() { return VkApplicationInfo.napplicationVersion(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pEngineName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pEngineName() { return VkApplicationInfo.npEngineName(address()); }
        /** @return the null-terminated string pointed to by the {@code pEngineName} field. */
        @NativeType("char const *")
        public @Nullable String pEngineNameString() { return VkApplicationInfo.npEngineNameString(address()); }
        /** @return the value of the {@code engineVersion} field. */
        @NativeType("uint32_t")
        public int engineVersion() { return VkApplicationInfo.nengineVersion(address()); }
        /** @return the value of the {@code apiVersion} field. */
        @NativeType("uint32_t")
        public int apiVersion() { return VkApplicationInfo.napiVersion(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkApplicationInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkApplicationInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO} value to the {@code sType} field. */
        public VkApplicationInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkApplicationInfo.Buffer pNext(@NativeType("void const *") long value) { VkApplicationInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pApplicationName} field. */
        public VkApplicationInfo.Buffer pApplicationName(@Nullable @NativeType("char const *") ByteBuffer value) { VkApplicationInfo.npApplicationName(address(), value); return this; }
        /** Sets the specified value to the {@code applicationVersion} field. */
        public VkApplicationInfo.Buffer applicationVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.napplicationVersion(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pEngineName} field. */
        public VkApplicationInfo.Buffer pEngineName(@Nullable @NativeType("char const *") ByteBuffer value) { VkApplicationInfo.npEngineName(address(), value); return this; }
        /** Sets the specified value to the {@code engineVersion} field. */
        public VkApplicationInfo.Buffer engineVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.nengineVersion(address(), value); return this; }
        /** Sets the specified value to the {@code apiVersion} field. */
        public VkApplicationInfo.Buffer apiVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.napiVersion(address(), value); return this; }

    }

}