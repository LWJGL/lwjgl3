/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Initialization parameters used by {@link BGFX#bgfx_init init}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_init_t {
 *     bgfx_renderer_type_t {@link #type};
 *     uint16_t {@link #vendorId};
 *     uint16_t {@link #deviceId};
 *     uint64_t {@link #capabilities};
 *     bool {@link #debug};
 *     bool {@link #profile};
 *     {@link BGFXPlatformData bgfx_platform_data_t} {@link #platformData};
 *     {@link BGFXResolution bgfx_resolution_t} {@link #resolution};
 *     {@link BGFXInitLimits bgfx_init_limits_t} {@link #limits};
 *     {@link BGFXCallbackInterface bgfx_callback_interface_t} * {@link #callback};
 *     {@link BGFXAllocatorInterface bgfx_allocator_interface_t} * {@link #allocator};
 * }</code></pre>
 */
@NativeType("struct bgfx_init_t")
public class BGFXInit extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        VENDORID,
        DEVICEID,
        CAPABILITIES,
        DEBUG,
        PROFILE,
        PLATFORMDATA,
        RESOLUTION,
        LIMITS,
        CALLBACK,
        ALLOCATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(8),
            __member(1),
            __member(1),
            __member(BGFXPlatformData.SIZEOF, BGFXPlatformData.ALIGNOF),
            __member(BGFXResolution.SIZEOF, BGFXResolution.ALIGNOF),
            __member(BGFXInitLimits.SIZEOF, BGFXInitLimits.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        VENDORID = layout.offsetof(1);
        DEVICEID = layout.offsetof(2);
        CAPABILITIES = layout.offsetof(3);
        DEBUG = layout.offsetof(4);
        PROFILE = layout.offsetof(5);
        PLATFORMDATA = layout.offsetof(6);
        RESOLUTION = layout.offsetof(7);
        LIMITS = layout.offsetof(8);
        CALLBACK = layout.offsetof(9);
        ALLOCATOR = layout.offsetof(10);
    }

    /**
     * Creates a {@code BGFXInit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXInit(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** select rendering backend. When set to {@link BGFX#BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT} a default rendering backend will be selected appropriate to the platform. One of:<br><table><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_NOOP RENDERER_TYPE_NOOP}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_AGC RENDERER_TYPE_AGC}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D9 RENDERER_TYPE_DIRECT3D9}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D11 RENDERER_TYPE_DIRECT3D11}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_DIRECT3D12 RENDERER_TYPE_DIRECT3D12}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_GNM RENDERER_TYPE_GNM}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_METAL RENDERER_TYPE_METAL}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_NVN RENDERER_TYPE_NVN}</td></tr><tr><td>{@link BGFX#BGFX_RENDERER_TYPE_OPENGLES RENDERER_TYPE_OPENGLES}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_OPENGL RENDERER_TYPE_OPENGL}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_VULKAN RENDERER_TYPE_VULKAN}</td><td>{@link BGFX#BGFX_RENDERER_TYPE_COUNT RENDERER_TYPE_COUNT}</td></tr></table> */
    @NativeType("bgfx_renderer_type_t")
    public int type() { return ntype(address()); }
    /** vendor PCI id. If set to {@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE} it will select the first device. One of:<br><table><tr><td>{@link BGFX#BGFX_PCI_ID_NONE PCI_ID_NONE}</td><td>{@link BGFX#BGFX_PCI_ID_SOFTWARE_RASTERIZER PCI_ID_SOFTWARE_RASTERIZER}</td><td>{@link BGFX#BGFX_PCI_ID_AMD PCI_ID_AMD}</td><td>{@link BGFX#BGFX_PCI_ID_APPLE PCI_ID_APPLE}</td><td>{@link BGFX#BGFX_PCI_ID_INTEL PCI_ID_INTEL}</td></tr><tr><td>{@link BGFX#BGFX_PCI_ID_NVIDIA PCI_ID_NVIDIA}</td><td>{@link BGFX#BGFX_PCI_ID_MICROSOFT PCI_ID_MICROSOFT}</td></tr></table> */
    @NativeType("uint16_t")
    public short vendorId() { return nvendorId(address()); }
    /** device id. If set to 0 it will select first device, or device with matching id. */
    @NativeType("uint16_t")
    public short deviceId() { return ndeviceId(address()); }
    /** capabilities initialization mask (default: {@code UINT64_MAX}) */
    @NativeType("uint64_t")
    public long capabilities() { return ncapabilities(address()); }
    /** enable device for debugging */
    @NativeType("bool")
    public boolean debug() { return ndebug(address()); }
    /** enable device for profiling */
    @NativeType("bool")
    public boolean profile() { return nprofile(address()); }
    /** platform data */
    @NativeType("bgfx_platform_data_t")
    public BGFXPlatformData platformData() { return nplatformData(address()); }
    /** backbuffer resolution and reset parameters */
    @NativeType("bgfx_resolution_t")
    public BGFXResolution resolution() { return nresolution(address()); }
    /** configurable runtime limits parameters */
    @NativeType("bgfx_init_limits_t")
    public BGFXInitLimits limits() { return nlimits(address()); }
    /** provide application specific callback interface */
    @Nullable
    @NativeType("bgfx_callback_interface_t *")
    public BGFXCallbackInterface callback() { return ncallback(address()); }
    /** custom allocator. When a custom allocator is not specified, bgfx uses the CRT allocator. Bgfx assumes	custom allocator is thread safe. */
    @Nullable
    @NativeType("bgfx_allocator_interface_t *")
    public BGFXAllocatorInterface allocator() { return nallocator(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public BGFXInit type(@NativeType("bgfx_renderer_type_t") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #vendorId} field. */
    public BGFXInit vendorId(@NativeType("uint16_t") short value) { nvendorId(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceId} field. */
    public BGFXInit deviceId(@NativeType("uint16_t") short value) { ndeviceId(address(), value); return this; }
    /** Sets the specified value to the {@link #capabilities} field. */
    public BGFXInit capabilities(@NativeType("uint64_t") long value) { ncapabilities(address(), value); return this; }
    /** Sets the specified value to the {@link #debug} field. */
    public BGFXInit debug(@NativeType("bool") boolean value) { ndebug(address(), value); return this; }
    /** Sets the specified value to the {@link #profile} field. */
    public BGFXInit profile(@NativeType("bool") boolean value) { nprofile(address(), value); return this; }
    /** Copies the specified {@link BGFXPlatformData} to the {@link #platformData} field. */
    public BGFXInit platformData(@NativeType("bgfx_platform_data_t") BGFXPlatformData value) { nplatformData(address(), value); return this; }
    /** Passes the {@link #platformData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BGFXInit platformData(java.util.function.Consumer<BGFXPlatformData> consumer) { consumer.accept(platformData()); return this; }
    /** Copies the specified {@link BGFXResolution} to the {@link #resolution} field. */
    public BGFXInit resolution(@NativeType("bgfx_resolution_t") BGFXResolution value) { nresolution(address(), value); return this; }
    /** Passes the {@link #resolution} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BGFXInit resolution(java.util.function.Consumer<BGFXResolution> consumer) { consumer.accept(resolution()); return this; }
    /** Copies the specified {@link BGFXInitLimits} to the {@link #limits} field. */
    public BGFXInit limits(@NativeType("bgfx_init_limits_t") BGFXInitLimits value) { nlimits(address(), value); return this; }
    /** Passes the {@link #limits} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BGFXInit limits(java.util.function.Consumer<BGFXInitLimits> consumer) { consumer.accept(limits()); return this; }
    /** Sets the address of the specified {@link BGFXCallbackInterface} to the {@link #callback} field. */
    public BGFXInit callback(@Nullable @NativeType("bgfx_callback_interface_t *") BGFXCallbackInterface value) { ncallback(address(), value); return this; }
    /** Sets the address of the specified {@link BGFXAllocatorInterface} to the {@link #allocator} field. */
    public BGFXInit allocator(@Nullable @NativeType("bgfx_allocator_interface_t *") BGFXAllocatorInterface value) { nallocator(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXInit set(
        int type,
        short vendorId,
        short deviceId,
        long capabilities,
        boolean debug,
        boolean profile,
        BGFXPlatformData platformData,
        BGFXResolution resolution,
        BGFXInitLimits limits,
        @Nullable BGFXCallbackInterface callback,
        @Nullable BGFXAllocatorInterface allocator
    ) {
        type(type);
        vendorId(vendorId);
        deviceId(deviceId);
        capabilities(capabilities);
        debug(debug);
        profile(profile);
        platformData(platformData);
        resolution(resolution);
        limits(limits);
        callback(callback);
        allocator(allocator);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXInit set(BGFXInit src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXInit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXInit malloc() {
        return wrap(BGFXInit.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXInit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXInit calloc() {
        return wrap(BGFXInit.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXInit} instance allocated with {@link BufferUtils}. */
    public static BGFXInit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXInit.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXInit} instance for the specified memory address. */
    public static BGFXInit create(long address) {
        return wrap(BGFXInit.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXInit createSafe(long address) {
        return address == NULL ? null : wrap(BGFXInit.class, address);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInit mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInit callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInit mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInit callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code BGFXInit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInit malloc(MemoryStack stack) {
        return wrap(BGFXInit.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXInit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInit calloc(MemoryStack stack) {
        return wrap(BGFXInit.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + BGFXInit.TYPE); }
    /** Unsafe version of {@link #vendorId}. */
    public static short nvendorId(long struct) { return UNSAFE.getShort(null, struct + BGFXInit.VENDORID); }
    /** Unsafe version of {@link #deviceId}. */
    public static short ndeviceId(long struct) { return UNSAFE.getShort(null, struct + BGFXInit.DEVICEID); }
    /** Unsafe version of {@link #capabilities}. */
    public static long ncapabilities(long struct) { return UNSAFE.getLong(null, struct + BGFXInit.CAPABILITIES); }
    /** Unsafe version of {@link #debug}. */
    public static boolean ndebug(long struct) { return UNSAFE.getByte(null, struct + BGFXInit.DEBUG) != 0; }
    /** Unsafe version of {@link #profile}. */
    public static boolean nprofile(long struct) { return UNSAFE.getByte(null, struct + BGFXInit.PROFILE) != 0; }
    /** Unsafe version of {@link #platformData}. */
    public static BGFXPlatformData nplatformData(long struct) { return BGFXPlatformData.create(struct + BGFXInit.PLATFORMDATA); }
    /** Unsafe version of {@link #resolution}. */
    public static BGFXResolution nresolution(long struct) { return BGFXResolution.create(struct + BGFXInit.RESOLUTION); }
    /** Unsafe version of {@link #limits}. */
    public static BGFXInitLimits nlimits(long struct) { return BGFXInitLimits.create(struct + BGFXInit.LIMITS); }
    /** Unsafe version of {@link #callback}. */
    @Nullable public static BGFXCallbackInterface ncallback(long struct) { return BGFXCallbackInterface.createSafe(memGetAddress(struct + BGFXInit.CALLBACK)); }
    /** Unsafe version of {@link #allocator}. */
    @Nullable public static BGFXAllocatorInterface nallocator(long struct) { return BGFXAllocatorInterface.createSafe(memGetAddress(struct + BGFXInit.ALLOCATOR)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + BGFXInit.TYPE, value); }
    /** Unsafe version of {@link #vendorId(short) vendorId}. */
    public static void nvendorId(long struct, short value) { UNSAFE.putShort(null, struct + BGFXInit.VENDORID, value); }
    /** Unsafe version of {@link #deviceId(short) deviceId}. */
    public static void ndeviceId(long struct, short value) { UNSAFE.putShort(null, struct + BGFXInit.DEVICEID, value); }
    /** Unsafe version of {@link #capabilities(long) capabilities}. */
    public static void ncapabilities(long struct, long value) { UNSAFE.putLong(null, struct + BGFXInit.CAPABILITIES, value); }
    /** Unsafe version of {@link #debug(boolean) debug}. */
    public static void ndebug(long struct, boolean value) { UNSAFE.putByte(null, struct + BGFXInit.DEBUG, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #profile(boolean) profile}. */
    public static void nprofile(long struct, boolean value) { UNSAFE.putByte(null, struct + BGFXInit.PROFILE, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #platformData(BGFXPlatformData) platformData}. */
    public static void nplatformData(long struct, BGFXPlatformData value) { memCopy(value.address(), struct + BGFXInit.PLATFORMDATA, BGFXPlatformData.SIZEOF); }
    /** Unsafe version of {@link #resolution(BGFXResolution) resolution}. */
    public static void nresolution(long struct, BGFXResolution value) { memCopy(value.address(), struct + BGFXInit.RESOLUTION, BGFXResolution.SIZEOF); }
    /** Unsafe version of {@link #limits(BGFXInitLimits) limits}. */
    public static void nlimits(long struct, BGFXInitLimits value) { memCopy(value.address(), struct + BGFXInit.LIMITS, BGFXInitLimits.SIZEOF); }
    /** Unsafe version of {@link #callback(BGFXCallbackInterface) callback}. */
    public static void ncallback(long struct, @Nullable BGFXCallbackInterface value) { memPutAddress(struct + BGFXInit.CALLBACK, memAddressSafe(value)); }
    /** Unsafe version of {@link #allocator(BGFXAllocatorInterface) allocator}. */
    public static void nallocator(long struct, @Nullable BGFXAllocatorInterface value) { memPutAddress(struct + BGFXInit.ALLOCATOR, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long callback = memGetAddress(struct + BGFXInit.CALLBACK);
        if (callback != NULL) {
            BGFXCallbackInterface.validate(callback);
        }
        long allocator = memGetAddress(struct + BGFXInit.ALLOCATOR);
        if (allocator != NULL) {
            BGFXAllocatorInterface.validate(allocator);
        }
    }

}