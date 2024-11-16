/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUarrayMapInfo {
 *     CUresourcetype resourceType;
 *     union {
 *         CUmipmappedArray mipmap;
 *         CUarray array;
 *     } resource;
 *     CUarraySparseSubresourceType subresourceType;
 *     union {
 *         struct {
 *             unsigned int level;
 *             unsigned int layer;
 *             unsigned int offsetX;
 *             unsigned int offsetY;
 *             unsigned int offsetZ;
 *             unsigned int extentWidth;
 *             unsigned int extentHeight;
 *             unsigned int extentDepth;
 *         } sparseLevel;
 *         struct {
 *             unsigned int layer;
 *             unsigned long long offset;
 *             unsigned long long size;
 *         } miptail;
 *     } subresource;
 *     CUmemOperationType memOperationType;
 *     CUmemHandleType memHandleType;
 *     union {
 *         CUmemGenericAllocationHandle memHandle;
 *     } memHandle;
 *     unsigned long long offset;
 *     unsigned int deviceBitMask;
 *     unsigned int flags;
 *     unsigned int reserved[2];
 * }</code></pre>
 */
public class CUarrayMapInfo extends Struct<CUarrayMapInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESOURCETYPE,
        RESOURCE,
            RESOURCE_MIPMAP,
            RESOURCE_ARRAY,
        SUBRESOURCETYPE,
        SUBRESOURCE,
            SUBRESOURCE_SPARSELEVEL,
                SUBRESOURCE_SPARSELEVEL_LEVEL,
                SUBRESOURCE_SPARSELEVEL_LAYER,
                SUBRESOURCE_SPARSELEVEL_OFFSETX,
                SUBRESOURCE_SPARSELEVEL_OFFSETY,
                SUBRESOURCE_SPARSELEVEL_OFFSETZ,
                SUBRESOURCE_SPARSELEVEL_EXTENTWIDTH,
                SUBRESOURCE_SPARSELEVEL_EXTENTHEIGHT,
                SUBRESOURCE_SPARSELEVEL_EXTENTDEPTH,
            SUBRESOURCE_MIPTAIL,
                SUBRESOURCE_MIPTAIL_LAYER,
                SUBRESOURCE_MIPTAIL_OFFSET,
                SUBRESOURCE_MIPTAIL_SIZE,
        MEMOPERATIONTYPE,
        MEMHANDLETYPE,
        MEMHANDLE,
            MEMHANDLE_MEMHANDLE,
        OFFSET,
        DEVICEBITMASK,
        FLAGS,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            ),
            __member(4),
            __union(
                __struct(
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4),
                    __member(4)
                ),
                __struct(
                    __member(4),
                    __member(8),
                    __member(8)
                )
            ),
            __member(4),
            __member(4),
            __union(
                __member(8)
            ),
            __member(8),
            __member(4),
            __member(4),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESOURCETYPE = layout.offsetof(0);
        RESOURCE = layout.offsetof(1);
            RESOURCE_MIPMAP = layout.offsetof(2);
            RESOURCE_ARRAY = layout.offsetof(3);
        SUBRESOURCETYPE = layout.offsetof(4);
        SUBRESOURCE = layout.offsetof(5);
            SUBRESOURCE_SPARSELEVEL = layout.offsetof(6);
                SUBRESOURCE_SPARSELEVEL_LEVEL = layout.offsetof(7);
                SUBRESOURCE_SPARSELEVEL_LAYER = layout.offsetof(8);
                SUBRESOURCE_SPARSELEVEL_OFFSETX = layout.offsetof(9);
                SUBRESOURCE_SPARSELEVEL_OFFSETY = layout.offsetof(10);
                SUBRESOURCE_SPARSELEVEL_OFFSETZ = layout.offsetof(11);
                SUBRESOURCE_SPARSELEVEL_EXTENTWIDTH = layout.offsetof(12);
                SUBRESOURCE_SPARSELEVEL_EXTENTHEIGHT = layout.offsetof(13);
                SUBRESOURCE_SPARSELEVEL_EXTENTDEPTH = layout.offsetof(14);
            SUBRESOURCE_MIPTAIL = layout.offsetof(15);
                SUBRESOURCE_MIPTAIL_LAYER = layout.offsetof(16);
                SUBRESOURCE_MIPTAIL_OFFSET = layout.offsetof(17);
                SUBRESOURCE_MIPTAIL_SIZE = layout.offsetof(18);
        MEMOPERATIONTYPE = layout.offsetof(19);
        MEMHANDLETYPE = layout.offsetof(20);
        MEMHANDLE = layout.offsetof(21);
            MEMHANDLE_MEMHANDLE = layout.offsetof(22);
        OFFSET = layout.offsetof(23);
        DEVICEBITMASK = layout.offsetof(24);
        FLAGS = layout.offsetof(25);
        RESERVED = layout.offsetof(26);
    }

    protected CUarrayMapInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUarrayMapInfo create(long address, @Nullable ByteBuffer container) {
        return new CUarrayMapInfo(address, container);
    }

    /**
     * Creates a {@code CUarrayMapInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUarrayMapInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code resourceType} field. */
    @NativeType("CUresourcetype")
    public int resourceType() { return nresourceType(address()); }
    /** @return the value of the {@code resource.mipmap} field. */
    @NativeType("CUmipmappedArray")
    public long resource_mipmap() { return nresource_mipmap(address()); }
    /** @return the value of the {@code resource.array} field. */
    @NativeType("CUarray")
    public long resource_array() { return nresource_array(address()); }
    /** @return the value of the {@code subresourceType} field. */
    @NativeType("CUarraySparseSubresourceType")
    public int subresourceType() { return nsubresourceType(address()); }
    /** @return the value of the {@code subresource.sparseLevel.level} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_level() { return nsubresource_sparseLevel_level(address()); }
    /** @return the value of the {@code subresource.sparseLevel.layer} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_layer() { return nsubresource_sparseLevel_layer(address()); }
    /** @return the value of the {@code subresource.sparseLevel.offsetX} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_offsetX() { return nsubresource_sparseLevel_offsetX(address()); }
    /** @return the value of the {@code subresource.sparseLevel.offsetY} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_offsetY() { return nsubresource_sparseLevel_offsetY(address()); }
    /** @return the value of the {@code subresource.sparseLevel.offsetZ} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_offsetZ() { return nsubresource_sparseLevel_offsetZ(address()); }
    /** @return the value of the {@code subresource.sparseLevel.extentWidth} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_extentWidth() { return nsubresource_sparseLevel_extentWidth(address()); }
    /** @return the value of the {@code subresource.sparseLevel.extentHeight} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_extentHeight() { return nsubresource_sparseLevel_extentHeight(address()); }
    /** @return the value of the {@code subresource.sparseLevel.extentDepth} field. */
    @NativeType("unsigned int")
    public int subresource_sparseLevel_extentDepth() { return nsubresource_sparseLevel_extentDepth(address()); }
    /** @return the value of the {@code subresource.miptail.layer} field. */
    @NativeType("unsigned int")
    public int subresource_miptail_layer() { return nsubresource_miptail_layer(address()); }
    /** @return the value of the {@code subresource.miptail.offset} field. */
    @NativeType("unsigned long long")
    public long subresource_miptail_offset() { return nsubresource_miptail_offset(address()); }
    /** @return the value of the {@code subresource.miptail.size} field. */
    @NativeType("unsigned long long")
    public long subresource_miptail_size() { return nsubresource_miptail_size(address()); }
    /** @return the value of the {@code memOperationType} field. */
    @NativeType("CUmemOperationType")
    public int memOperationType() { return nmemOperationType(address()); }
    /** @return the value of the {@code memHandleType} field. */
    @NativeType("CUmemHandleType")
    public int memHandleType() { return nmemHandleType(address()); }
    /** @return the value of the {@code memHandle.memHandle} field. */
    @NativeType("CUmemGenericAllocationHandle")
    public long memHandle_memHandle() { return nmemHandle_memHandle(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("unsigned long long")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code deviceBitMask} field. */
    @NativeType("unsigned int")
    public int deviceBitMask() { return ndeviceBitMask(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("unsigned int")
    public int flags() { return nflags(address()); }
    /** @return a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned int[2]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** @return the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned int")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code resourceType} field. */
    public CUarrayMapInfo resourceType(@NativeType("CUresourcetype") int value) { nresourceType(address(), value); return this; }
    /** Sets the specified value to the {@code mipmap} field. */
    public CUarrayMapInfo resource_mipmap(@NativeType("CUmipmappedArray") long value) { nresource_mipmap(address(), value); return this; }
    /** Sets the specified value to the {@code array} field. */
    public CUarrayMapInfo resource_array(@NativeType("CUarray") long value) { nresource_array(address(), value); return this; }
    /** Sets the specified value to the {@code subresourceType} field. */
    public CUarrayMapInfo subresourceType(@NativeType("CUarraySparseSubresourceType") int value) { nsubresourceType(address(), value); return this; }
    /** Sets the specified value to the {@code level} field. */
    public CUarrayMapInfo subresource_sparseLevel_level(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_level(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public CUarrayMapInfo subresource_sparseLevel_layer(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_layer(address(), value); return this; }
    /** Sets the specified value to the {@code offsetX} field. */
    public CUarrayMapInfo subresource_sparseLevel_offsetX(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_offsetX(address(), value); return this; }
    /** Sets the specified value to the {@code offsetY} field. */
    public CUarrayMapInfo subresource_sparseLevel_offsetY(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_offsetY(address(), value); return this; }
    /** Sets the specified value to the {@code offsetZ} field. */
    public CUarrayMapInfo subresource_sparseLevel_offsetZ(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_offsetZ(address(), value); return this; }
    /** Sets the specified value to the {@code extentWidth} field. */
    public CUarrayMapInfo subresource_sparseLevel_extentWidth(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_extentWidth(address(), value); return this; }
    /** Sets the specified value to the {@code extentHeight} field. */
    public CUarrayMapInfo subresource_sparseLevel_extentHeight(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_extentHeight(address(), value); return this; }
    /** Sets the specified value to the {@code extentDepth} field. */
    public CUarrayMapInfo subresource_sparseLevel_extentDepth(@NativeType("unsigned int") int value) { nsubresource_sparseLevel_extentDepth(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public CUarrayMapInfo subresource_miptail_layer(@NativeType("unsigned int") int value) { nsubresource_miptail_layer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public CUarrayMapInfo subresource_miptail_offset(@NativeType("unsigned long long") long value) { nsubresource_miptail_offset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public CUarrayMapInfo subresource_miptail_size(@NativeType("unsigned long long") long value) { nsubresource_miptail_size(address(), value); return this; }
    /** Sets the specified value to the {@code memOperationType} field. */
    public CUarrayMapInfo memOperationType(@NativeType("CUmemOperationType") int value) { nmemOperationType(address(), value); return this; }
    /** Sets the specified value to the {@code memHandleType} field. */
    public CUarrayMapInfo memHandleType(@NativeType("CUmemHandleType") int value) { nmemHandleType(address(), value); return this; }
    /** Sets the specified value to the {@code memHandle} field. */
    public CUarrayMapInfo memHandle_memHandle(@NativeType("CUmemGenericAllocationHandle") long value) { nmemHandle_memHandle(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public CUarrayMapInfo offset(@NativeType("unsigned long long") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code deviceBitMask} field. */
    public CUarrayMapInfo deviceBitMask(@NativeType("unsigned int") int value) { ndeviceBitMask(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public CUarrayMapInfo flags(@NativeType("unsigned int") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public CUarrayMapInfo reserved(@NativeType("unsigned int[2]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUarrayMapInfo reserved(int index, @NativeType("unsigned int") int value) { nreserved(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUarrayMapInfo set(CUarrayMapInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUarrayMapInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUarrayMapInfo malloc() {
        return new CUarrayMapInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUarrayMapInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUarrayMapInfo calloc() {
        return new CUarrayMapInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUarrayMapInfo} instance allocated with {@link BufferUtils}. */
    public static CUarrayMapInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUarrayMapInfo(memAddress(container), container);
    }

    /** Returns a new {@code CUarrayMapInfo} instance for the specified memory address. */
    public static CUarrayMapInfo create(long address) {
        return new CUarrayMapInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUarrayMapInfo createSafe(long address) {
        return address == NULL ? null : new CUarrayMapInfo(address, null);
    }

    /**
     * Returns a new {@link CUarrayMapInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUarrayMapInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUarrayMapInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUarrayMapInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUarrayMapInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUarrayMapInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUarrayMapInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUarrayMapInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUarrayMapInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUarrayMapInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUarrayMapInfo malloc(MemoryStack stack) {
        return new CUarrayMapInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUarrayMapInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUarrayMapInfo calloc(MemoryStack stack) {
        return new CUarrayMapInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUarrayMapInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUarrayMapInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUarrayMapInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUarrayMapInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resourceType}. */
    public static int nresourceType(long struct) { return memGetInt(struct + CUarrayMapInfo.RESOURCETYPE); }
    /** Unsafe version of {@link #resource_mipmap}. */
    public static long nresource_mipmap(long struct) { return memGetAddress(struct + CUarrayMapInfo.RESOURCE_MIPMAP); }
    /** Unsafe version of {@link #resource_array}. */
    public static long nresource_array(long struct) { return memGetAddress(struct + CUarrayMapInfo.RESOURCE_ARRAY); }
    /** Unsafe version of {@link #subresourceType}. */
    public static int nsubresourceType(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCETYPE); }
    /** Unsafe version of {@link #subresource_sparseLevel_level}. */
    public static int nsubresource_sparseLevel_level(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_LEVEL); }
    /** Unsafe version of {@link #subresource_sparseLevel_layer}. */
    public static int nsubresource_sparseLevel_layer(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_LAYER); }
    /** Unsafe version of {@link #subresource_sparseLevel_offsetX}. */
    public static int nsubresource_sparseLevel_offsetX(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_OFFSETX); }
    /** Unsafe version of {@link #subresource_sparseLevel_offsetY}. */
    public static int nsubresource_sparseLevel_offsetY(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_OFFSETY); }
    /** Unsafe version of {@link #subresource_sparseLevel_offsetZ}. */
    public static int nsubresource_sparseLevel_offsetZ(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_OFFSETZ); }
    /** Unsafe version of {@link #subresource_sparseLevel_extentWidth}. */
    public static int nsubresource_sparseLevel_extentWidth(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_EXTENTWIDTH); }
    /** Unsafe version of {@link #subresource_sparseLevel_extentHeight}. */
    public static int nsubresource_sparseLevel_extentHeight(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_EXTENTHEIGHT); }
    /** Unsafe version of {@link #subresource_sparseLevel_extentDepth}. */
    public static int nsubresource_sparseLevel_extentDepth(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_EXTENTDEPTH); }
    /** Unsafe version of {@link #subresource_miptail_layer}. */
    public static int nsubresource_miptail_layer(long struct) { return memGetInt(struct + CUarrayMapInfo.SUBRESOURCE_MIPTAIL_LAYER); }
    /** Unsafe version of {@link #subresource_miptail_offset}. */
    public static long nsubresource_miptail_offset(long struct) { return memGetLong(struct + CUarrayMapInfo.SUBRESOURCE_MIPTAIL_OFFSET); }
    /** Unsafe version of {@link #subresource_miptail_size}. */
    public static long nsubresource_miptail_size(long struct) { return memGetLong(struct + CUarrayMapInfo.SUBRESOURCE_MIPTAIL_SIZE); }
    /** Unsafe version of {@link #memOperationType}. */
    public static int nmemOperationType(long struct) { return memGetInt(struct + CUarrayMapInfo.MEMOPERATIONTYPE); }
    /** Unsafe version of {@link #memHandleType}. */
    public static int nmemHandleType(long struct) { return memGetInt(struct + CUarrayMapInfo.MEMHANDLETYPE); }
    /** Unsafe version of {@link #memHandle_memHandle}. */
    public static long nmemHandle_memHandle(long struct) { return memGetLong(struct + CUarrayMapInfo.MEMHANDLE_MEMHANDLE); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + CUarrayMapInfo.OFFSET); }
    /** Unsafe version of {@link #deviceBitMask}. */
    public static int ndeviceBitMask(long struct) { return memGetInt(struct + CUarrayMapInfo.DEVICEBITMASK); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + CUarrayMapInfo.FLAGS); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + CUarrayMapInfo.RESERVED, 2); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return memGetInt(struct + CUarrayMapInfo.RESERVED + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #resourceType(int) resourceType}. */
    public static void nresourceType(long struct, int value) { memPutInt(struct + CUarrayMapInfo.RESOURCETYPE, value); }
    /** Unsafe version of {@link #resource_mipmap(long) resource_mipmap}. */
    public static void nresource_mipmap(long struct, long value) { memPutAddress(struct + CUarrayMapInfo.RESOURCE_MIPMAP, value); }
    /** Unsafe version of {@link #resource_array(long) resource_array}. */
    public static void nresource_array(long struct, long value) { memPutAddress(struct + CUarrayMapInfo.RESOURCE_ARRAY, value); }
    /** Unsafe version of {@link #subresourceType(int) subresourceType}. */
    public static void nsubresourceType(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCETYPE, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_level(int) subresource_sparseLevel_level}. */
    public static void nsubresource_sparseLevel_level(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_LEVEL, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_layer(int) subresource_sparseLevel_layer}. */
    public static void nsubresource_sparseLevel_layer(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_LAYER, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_offsetX(int) subresource_sparseLevel_offsetX}. */
    public static void nsubresource_sparseLevel_offsetX(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_OFFSETX, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_offsetY(int) subresource_sparseLevel_offsetY}. */
    public static void nsubresource_sparseLevel_offsetY(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_OFFSETY, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_offsetZ(int) subresource_sparseLevel_offsetZ}. */
    public static void nsubresource_sparseLevel_offsetZ(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_OFFSETZ, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_extentWidth(int) subresource_sparseLevel_extentWidth}. */
    public static void nsubresource_sparseLevel_extentWidth(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_EXTENTWIDTH, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_extentHeight(int) subresource_sparseLevel_extentHeight}. */
    public static void nsubresource_sparseLevel_extentHeight(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_EXTENTHEIGHT, value); }
    /** Unsafe version of {@link #subresource_sparseLevel_extentDepth(int) subresource_sparseLevel_extentDepth}. */
    public static void nsubresource_sparseLevel_extentDepth(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_SPARSELEVEL_EXTENTDEPTH, value); }
    /** Unsafe version of {@link #subresource_miptail_layer(int) subresource_miptail_layer}. */
    public static void nsubresource_miptail_layer(long struct, int value) { memPutInt(struct + CUarrayMapInfo.SUBRESOURCE_MIPTAIL_LAYER, value); }
    /** Unsafe version of {@link #subresource_miptail_offset(long) subresource_miptail_offset}. */
    public static void nsubresource_miptail_offset(long struct, long value) { memPutLong(struct + CUarrayMapInfo.SUBRESOURCE_MIPTAIL_OFFSET, value); }
    /** Unsafe version of {@link #subresource_miptail_size(long) subresource_miptail_size}. */
    public static void nsubresource_miptail_size(long struct, long value) { memPutLong(struct + CUarrayMapInfo.SUBRESOURCE_MIPTAIL_SIZE, value); }
    /** Unsafe version of {@link #memOperationType(int) memOperationType}. */
    public static void nmemOperationType(long struct, int value) { memPutInt(struct + CUarrayMapInfo.MEMOPERATIONTYPE, value); }
    /** Unsafe version of {@link #memHandleType(int) memHandleType}. */
    public static void nmemHandleType(long struct, int value) { memPutInt(struct + CUarrayMapInfo.MEMHANDLETYPE, value); }
    /** Unsafe version of {@link #memHandle_memHandle(long) memHandle_memHandle}. */
    public static void nmemHandle_memHandle(long struct, long value) { memPutLong(struct + CUarrayMapInfo.MEMHANDLE_MEMHANDLE, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + CUarrayMapInfo.OFFSET, value); }
    /** Unsafe version of {@link #deviceBitMask(int) deviceBitMask}. */
    public static void ndeviceBitMask(long struct, int value) { memPutInt(struct + CUarrayMapInfo.DEVICEBITMASK, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + CUarrayMapInfo.FLAGS, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + CUarrayMapInfo.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        memPutInt(struct + CUarrayMapInfo.RESERVED + check(index, 2) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link CUarrayMapInfo} structs. */
    public static class Buffer extends StructBuffer<CUarrayMapInfo, Buffer> implements NativeResource {

        private static final CUarrayMapInfo ELEMENT_FACTORY = CUarrayMapInfo.create(-1L);

        /**
         * Creates a new {@code CUarrayMapInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUarrayMapInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUarrayMapInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code resourceType} field. */
        @NativeType("CUresourcetype")
        public int resourceType() { return CUarrayMapInfo.nresourceType(address()); }
        /** @return the value of the {@code resource.mipmap} field. */
        @NativeType("CUmipmappedArray")
        public long resource_mipmap() { return CUarrayMapInfo.nresource_mipmap(address()); }
        /** @return the value of the {@code resource.array} field. */
        @NativeType("CUarray")
        public long resource_array() { return CUarrayMapInfo.nresource_array(address()); }
        /** @return the value of the {@code subresourceType} field. */
        @NativeType("CUarraySparseSubresourceType")
        public int subresourceType() { return CUarrayMapInfo.nsubresourceType(address()); }
        /** @return the value of the {@code subresource.sparseLevel.level} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_level() { return CUarrayMapInfo.nsubresource_sparseLevel_level(address()); }
        /** @return the value of the {@code subresource.sparseLevel.layer} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_layer() { return CUarrayMapInfo.nsubresource_sparseLevel_layer(address()); }
        /** @return the value of the {@code subresource.sparseLevel.offsetX} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_offsetX() { return CUarrayMapInfo.nsubresource_sparseLevel_offsetX(address()); }
        /** @return the value of the {@code subresource.sparseLevel.offsetY} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_offsetY() { return CUarrayMapInfo.nsubresource_sparseLevel_offsetY(address()); }
        /** @return the value of the {@code subresource.sparseLevel.offsetZ} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_offsetZ() { return CUarrayMapInfo.nsubresource_sparseLevel_offsetZ(address()); }
        /** @return the value of the {@code subresource.sparseLevel.extentWidth} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_extentWidth() { return CUarrayMapInfo.nsubresource_sparseLevel_extentWidth(address()); }
        /** @return the value of the {@code subresource.sparseLevel.extentHeight} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_extentHeight() { return CUarrayMapInfo.nsubresource_sparseLevel_extentHeight(address()); }
        /** @return the value of the {@code subresource.sparseLevel.extentDepth} field. */
        @NativeType("unsigned int")
        public int subresource_sparseLevel_extentDepth() { return CUarrayMapInfo.nsubresource_sparseLevel_extentDepth(address()); }
        /** @return the value of the {@code subresource.miptail.layer} field. */
        @NativeType("unsigned int")
        public int subresource_miptail_layer() { return CUarrayMapInfo.nsubresource_miptail_layer(address()); }
        /** @return the value of the {@code subresource.miptail.offset} field. */
        @NativeType("unsigned long long")
        public long subresource_miptail_offset() { return CUarrayMapInfo.nsubresource_miptail_offset(address()); }
        /** @return the value of the {@code subresource.miptail.size} field. */
        @NativeType("unsigned long long")
        public long subresource_miptail_size() { return CUarrayMapInfo.nsubresource_miptail_size(address()); }
        /** @return the value of the {@code memOperationType} field. */
        @NativeType("CUmemOperationType")
        public int memOperationType() { return CUarrayMapInfo.nmemOperationType(address()); }
        /** @return the value of the {@code memHandleType} field. */
        @NativeType("CUmemHandleType")
        public int memHandleType() { return CUarrayMapInfo.nmemHandleType(address()); }
        /** @return the value of the {@code memHandle.memHandle} field. */
        @NativeType("CUmemGenericAllocationHandle")
        public long memHandle_memHandle() { return CUarrayMapInfo.nmemHandle_memHandle(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("unsigned long long")
        public long offset() { return CUarrayMapInfo.noffset(address()); }
        /** @return the value of the {@code deviceBitMask} field. */
        @NativeType("unsigned int")
        public int deviceBitMask() { return CUarrayMapInfo.ndeviceBitMask(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("unsigned int")
        public int flags() { return CUarrayMapInfo.nflags(address()); }
        /** @return a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned int[2]")
        public IntBuffer reserved() { return CUarrayMapInfo.nreserved(address()); }
        /** @return the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned int")
        public int reserved(int index) { return CUarrayMapInfo.nreserved(address(), index); }

        /** Sets the specified value to the {@code resourceType} field. */
        public CUarrayMapInfo.Buffer resourceType(@NativeType("CUresourcetype") int value) { CUarrayMapInfo.nresourceType(address(), value); return this; }
        /** Sets the specified value to the {@code mipmap} field. */
        public CUarrayMapInfo.Buffer resource_mipmap(@NativeType("CUmipmappedArray") long value) { CUarrayMapInfo.nresource_mipmap(address(), value); return this; }
        /** Sets the specified value to the {@code array} field. */
        public CUarrayMapInfo.Buffer resource_array(@NativeType("CUarray") long value) { CUarrayMapInfo.nresource_array(address(), value); return this; }
        /** Sets the specified value to the {@code subresourceType} field. */
        public CUarrayMapInfo.Buffer subresourceType(@NativeType("CUarraySparseSubresourceType") int value) { CUarrayMapInfo.nsubresourceType(address(), value); return this; }
        /** Sets the specified value to the {@code level} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_level(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_level(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_layer(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_layer(address(), value); return this; }
        /** Sets the specified value to the {@code offsetX} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_offsetX(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_offsetX(address(), value); return this; }
        /** Sets the specified value to the {@code offsetY} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_offsetY(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_offsetY(address(), value); return this; }
        /** Sets the specified value to the {@code offsetZ} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_offsetZ(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_offsetZ(address(), value); return this; }
        /** Sets the specified value to the {@code extentWidth} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_extentWidth(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_extentWidth(address(), value); return this; }
        /** Sets the specified value to the {@code extentHeight} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_extentHeight(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_extentHeight(address(), value); return this; }
        /** Sets the specified value to the {@code extentDepth} field. */
        public CUarrayMapInfo.Buffer subresource_sparseLevel_extentDepth(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_sparseLevel_extentDepth(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public CUarrayMapInfo.Buffer subresource_miptail_layer(@NativeType("unsigned int") int value) { CUarrayMapInfo.nsubresource_miptail_layer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public CUarrayMapInfo.Buffer subresource_miptail_offset(@NativeType("unsigned long long") long value) { CUarrayMapInfo.nsubresource_miptail_offset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public CUarrayMapInfo.Buffer subresource_miptail_size(@NativeType("unsigned long long") long value) { CUarrayMapInfo.nsubresource_miptail_size(address(), value); return this; }
        /** Sets the specified value to the {@code memOperationType} field. */
        public CUarrayMapInfo.Buffer memOperationType(@NativeType("CUmemOperationType") int value) { CUarrayMapInfo.nmemOperationType(address(), value); return this; }
        /** Sets the specified value to the {@code memHandleType} field. */
        public CUarrayMapInfo.Buffer memHandleType(@NativeType("CUmemHandleType") int value) { CUarrayMapInfo.nmemHandleType(address(), value); return this; }
        /** Sets the specified value to the {@code memHandle} field. */
        public CUarrayMapInfo.Buffer memHandle_memHandle(@NativeType("CUmemGenericAllocationHandle") long value) { CUarrayMapInfo.nmemHandle_memHandle(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public CUarrayMapInfo.Buffer offset(@NativeType("unsigned long long") long value) { CUarrayMapInfo.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code deviceBitMask} field. */
        public CUarrayMapInfo.Buffer deviceBitMask(@NativeType("unsigned int") int value) { CUarrayMapInfo.ndeviceBitMask(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public CUarrayMapInfo.Buffer flags(@NativeType("unsigned int") int value) { CUarrayMapInfo.nflags(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public CUarrayMapInfo.Buffer reserved(@NativeType("unsigned int[2]") IntBuffer value) { CUarrayMapInfo.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUarrayMapInfo.Buffer reserved(int index, @NativeType("unsigned int") int value) { CUarrayMapInfo.nreserved(address(), index, value); return this; }

    }

}