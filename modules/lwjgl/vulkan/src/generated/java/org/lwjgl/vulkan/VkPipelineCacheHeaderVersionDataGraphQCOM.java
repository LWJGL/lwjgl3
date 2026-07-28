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

import static org.lwjgl.vulkan.QCOMDataGraphModel.*;

/**
 * <pre>{@code
 * struct VkPipelineCacheHeaderVersionDataGraphQCOM {
 *     uint32_t headerSize;
 *     VkPipelineCacheHeaderVersion headerVersion;
 *     VkDataGraphModelCacheTypeQCOM cacheType;
 *     uint32_t cacheVersion;
 *     uint32_t toolchainVersion[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM];
 * }}</pre>
 */
public class VkPipelineCacheHeaderVersionDataGraphQCOM extends Struct<VkPipelineCacheHeaderVersionDataGraphQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADERSIZE,
        HEADERVERSION,
        CACHETYPE,
        CACHEVERSION,
        TOOLCHAINVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        CACHETYPE = layout.offsetof(2);
        CACHEVERSION = layout.offsetof(3);
        TOOLCHAINVERSION = layout.offsetof(4);
    }

    protected VkPipelineCacheHeaderVersionDataGraphQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineCacheHeaderVersionDataGraphQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(address, container);
    }

    /**
     * Creates a {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCacheHeaderVersionDataGraphQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code headerSize} field. */
    @NativeType("uint32_t")
    public int headerSize() { return nheaderSize(address()); }
    /** @return the value of the {@code headerVersion} field. */
    @NativeType("VkPipelineCacheHeaderVersion")
    public int headerVersion() { return nheaderVersion(address()); }
    /** @return the value of the {@code cacheType} field. */
    @NativeType("VkDataGraphModelCacheTypeQCOM")
    public int cacheType() { return ncacheType(address()); }
    /** @return the value of the {@code cacheVersion} field. */
    @NativeType("uint32_t")
    public int cacheVersion() { return ncacheVersion(address()); }
    /** @return a {@link IntBuffer} view of the {@code toolchainVersion} field. */
    @NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]")
    public IntBuffer toolchainVersion() { return ntoolchainVersion(address()); }
    /** @return the value at the specified index of the {@code toolchainVersion} field. */
    @NativeType("uint32_t")
    public int toolchainVersion(int index) { return ntoolchainVersion(address(), index); }

    /** Sets the specified value to the {@code headerSize} field. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerSize(@NativeType("uint32_t") int value) { nheaderSize(address(), value); return this; }
    /** Sets the specified value to the {@code headerVersion} field. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) { nheaderVersion(address(), value); return this; }
    /** Sets the specified value to the {@code cacheType} field. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheType(@NativeType("VkDataGraphModelCacheTypeQCOM") int value) { ncacheType(address(), value); return this; }
    /** Sets the specified value to the {@code cacheVersion} field. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheVersion(@NativeType("uint32_t") int value) { ncacheVersion(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code toolchainVersion} field. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersion(@NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]") IntBuffer value) { ntoolchainVersion(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code toolchainVersion} field. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersion(int index, @NativeType("uint32_t") int value) { ntoolchainVersion(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCacheHeaderVersionDataGraphQCOM set(
        int headerSize,
        int headerVersion,
        int cacheType,
        int cacheVersion,
        IntBuffer toolchainVersion
    ) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        cacheType(cacheType);
        cacheVersion(cacheVersion);
        toolchainVersion(toolchainVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCacheHeaderVersionDataGraphQCOM set(VkPipelineCacheHeaderVersionDataGraphQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM malloc() {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM calloc() {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance for the specified memory address. */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM create(long address) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineCacheHeaderVersionDataGraphQCOM createSafe(long address) {
        return address == NULL ? null : new VkPipelineCacheHeaderVersionDataGraphQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM malloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM calloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #headerSize}. */
    public static int nheaderSize(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.HEADERSIZE); }
    /** Unsafe version of {@link #headerVersion}. */
    public static int nheaderVersion(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.HEADERVERSION); }
    /** Unsafe version of {@link #cacheType}. */
    public static int ncacheType(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.CACHETYPE); }
    /** Unsafe version of {@link #cacheVersion}. */
    public static int ncacheVersion(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.CACHEVERSION); }
    /** Unsafe version of {@link #toolchainVersion}. */
    public static IntBuffer ntoolchainVersion(long struct) { return memIntBuffer(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.TOOLCHAINVERSION, VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM); }
    /** Unsafe version of {@link #toolchainVersion(int) toolchainVersion}. */
    public static int ntoolchainVersion(long struct, int index) {
        return memGetInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.TOOLCHAINVERSION + check(index, VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM) * 4);
    }

    /** Unsafe version of {@link #headerSize(int) headerSize}. */
    public static void nheaderSize(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.HEADERSIZE, value); }
    /** Unsafe version of {@link #headerVersion(int) headerVersion}. */
    public static void nheaderVersion(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.HEADERVERSION, value); }
    /** Unsafe version of {@link #cacheType(int) cacheType}. */
    public static void ncacheType(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.CACHETYPE, value); }
    /** Unsafe version of {@link #cacheVersion(int) cacheVersion}. */
    public static void ncacheVersion(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.CACHEVERSION, value); }
    /** Unsafe version of {@link #toolchainVersion(IntBuffer) toolchainVersion}. */
    public static void ntoolchainVersion(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM); }
        memCopy(memAddress(value), struct + VkPipelineCacheHeaderVersionDataGraphQCOM.TOOLCHAINVERSION, value.remaining() * 4);
    }
    /** Unsafe version of {@link #toolchainVersion(int, int) toolchainVersion}. */
    public static void ntoolchainVersion(long struct, int index, int value) {
        memPutInt(struct + VkPipelineCacheHeaderVersionDataGraphQCOM.TOOLCHAINVERSION + check(index, VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineCacheHeaderVersionDataGraphQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCacheHeaderVersionDataGraphQCOM, Buffer> implements NativeResource {

        private static final VkPipelineCacheHeaderVersionDataGraphQCOM ELEMENT_FACTORY = VkPipelineCacheHeaderVersionDataGraphQCOM.create(-1L);

        /**
         * Creates a new {@code VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCacheHeaderVersionDataGraphQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineCacheHeaderVersionDataGraphQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code headerSize} field. */
        @NativeType("uint32_t")
        public int headerSize() { return VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderSize(address()); }
        /** @return the value of the {@code headerVersion} field. */
        @NativeType("VkPipelineCacheHeaderVersion")
        public int headerVersion() { return VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderVersion(address()); }
        /** @return the value of the {@code cacheType} field. */
        @NativeType("VkDataGraphModelCacheTypeQCOM")
        public int cacheType() { return VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheType(address()); }
        /** @return the value of the {@code cacheVersion} field. */
        @NativeType("uint32_t")
        public int cacheVersion() { return VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheVersion(address()); }
        /** @return a {@link IntBuffer} view of the {@code toolchainVersion} field. */
        @NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]")
        public IntBuffer toolchainVersion() { return VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address()); }
        /** @return the value at the specified index of the {@code toolchainVersion} field. */
        @NativeType("uint32_t")
        public int toolchainVersion(int index) { return VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address(), index); }

        /** Sets the specified value to the {@code headerSize} field. */
        public VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer headerSize(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderSize(address(), value); return this; }
        /** Sets the specified value to the {@code headerVersion} field. */
        public VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) { VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderVersion(address(), value); return this; }
        /** Sets the specified value to the {@code cacheType} field. */
        public VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer cacheType(@NativeType("VkDataGraphModelCacheTypeQCOM") int value) { VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheType(address(), value); return this; }
        /** Sets the specified value to the {@code cacheVersion} field. */
        public VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer cacheVersion(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheVersion(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code toolchainVersion} field. */
        public VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer toolchainVersion(@NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]") IntBuffer value) { VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code toolchainVersion} field. */
        public VkPipelineCacheHeaderVersionDataGraphQCOM.Buffer toolchainVersion(int index, @NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address(), index, value); return this; }

    }

}