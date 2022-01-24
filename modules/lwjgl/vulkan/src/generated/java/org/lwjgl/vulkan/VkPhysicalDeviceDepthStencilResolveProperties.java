/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing depth/stencil resolve properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDepthStencilResolveProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDepthStencilResolveProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkResolveModeFlags {@link #supportedDepthResolveModes};
 *     VkResolveModeFlags {@link #supportedStencilResolveModes};
 *     VkBool32 {@link #independentResolveNone};
 *     VkBool32 {@link #independentResolve};
 * }</code></pre>
 */
public class VkPhysicalDeviceDepthStencilResolveProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTEDDEPTHRESOLVEMODES,
        SUPPORTEDSTENCILRESOLVEMODES,
        INDEPENDENTRESOLVENONE,
        INDEPENDENTRESOLVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDDEPTHRESOLVEMODES = layout.offsetof(2);
        SUPPORTEDSTENCILRESOLVEMODES = layout.offsetof(3);
        INDEPENDENTRESOLVENONE = layout.offsetof(4);
        INDEPENDENTRESOLVE = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthStencilResolveProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthStencilResolveProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkResolveModeFlagBits} indicating the set of supported depth resolve modes. {@link VK12#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT RESOLVE_MODE_SAMPLE_ZERO_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional modes. */
    @NativeType("VkResolveModeFlags")
    public int supportedDepthResolveModes() { return nsupportedDepthResolveModes(address()); }
    /** a bitmask of {@code VkResolveModeFlagBits} indicating the set of supported stencil resolve modes. {@link VK12#VK_RESOLVE_MODE_SAMPLE_ZERO_BIT RESOLVE_MODE_SAMPLE_ZERO_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional modes. {@link VK12#VK_RESOLVE_MODE_AVERAGE_BIT RESOLVE_MODE_AVERAGE_BIT} <b>must</b> not be included in the set. */
    @NativeType("VkResolveModeFlags")
    public int supportedStencilResolveModes() { return nsupportedStencilResolveModes(address()); }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports setting the depth and stencil resolve modes to different values when one of those modes is {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}. Otherwise the implementation only supports setting both modes to the same value. */
    @NativeType("VkBool32")
    public boolean independentResolveNone() { return nindependentResolveNone(address()) != 0; }
    /** {@link VK10#VK_TRUE TRUE} if the implementation supports all combinations of the supported depth and stencil resolve modes, including setting either depth or stencil resolve mode to {@link VK12#VK_RESOLVE_MODE_NONE RESOLVE_MODE_NONE}. An implementation that supports {@code independentResolve} <b>must</b> also support {@code independentResolveNone}. */
    @NativeType("VkBool32")
    public boolean independentResolve() { return nindependentResolve(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthStencilResolveProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthStencilResolveProperties sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDepthStencilResolveProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthStencilResolveProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthStencilResolveProperties set(VkPhysicalDeviceDepthStencilResolveProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthStencilResolveProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthStencilResolveProperties malloc() {
        return wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDepthStencilResolveProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthStencilResolveProperties calloc() {
        return wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDepthStencilResolveProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthStencilResolveProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthStencilResolveProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthStencilResolveProperties create(long address) {
        return wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthStencilResolveProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthStencilResolveProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthStencilResolveProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDepthStencilResolveProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthStencilResolveProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolveProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthStencilResolveProperties.PNEXT); }
    /** Unsafe version of {@link #supportedDepthResolveModes}. */
    public static int nsupportedDepthResolveModes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolveProperties.SUPPORTEDDEPTHRESOLVEMODES); }
    /** Unsafe version of {@link #supportedStencilResolveModes}. */
    public static int nsupportedStencilResolveModes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolveProperties.SUPPORTEDSTENCILRESOLVEMODES); }
    /** Unsafe version of {@link #independentResolveNone}. */
    public static int nindependentResolveNone(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolveProperties.INDEPENDENTRESOLVENONE); }
    /** Unsafe version of {@link #independentResolve}. */
    public static int nindependentResolve(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthStencilResolveProperties.INDEPENDENTRESOLVE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthStencilResolveProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthStencilResolveProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthStencilResolveProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthStencilResolveProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthStencilResolveProperties ELEMENT_FACTORY = VkPhysicalDeviceDepthStencilResolveProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthStencilResolveProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthStencilResolveProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDepthStencilResolveProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDepthStencilResolveProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthStencilResolveProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthStencilResolveProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthStencilResolveProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthStencilResolveProperties#supportedDepthResolveModes} field. */
        @NativeType("VkResolveModeFlags")
        public int supportedDepthResolveModes() { return VkPhysicalDeviceDepthStencilResolveProperties.nsupportedDepthResolveModes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthStencilResolveProperties#supportedStencilResolveModes} field. */
        @NativeType("VkResolveModeFlags")
        public int supportedStencilResolveModes() { return VkPhysicalDeviceDepthStencilResolveProperties.nsupportedStencilResolveModes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthStencilResolveProperties#independentResolveNone} field. */
        @NativeType("VkBool32")
        public boolean independentResolveNone() { return VkPhysicalDeviceDepthStencilResolveProperties.nindependentResolveNone(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDepthStencilResolveProperties#independentResolve} field. */
        @NativeType("VkBool32")
        public boolean independentResolve() { return VkPhysicalDeviceDepthStencilResolveProperties.nindependentResolve(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDepthStencilResolveProperties#sType} field. */
        public VkPhysicalDeviceDepthStencilResolveProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthStencilResolveProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES} value to the {@link VkPhysicalDeviceDepthStencilResolveProperties#sType} field. */
        public VkPhysicalDeviceDepthStencilResolveProperties.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthStencilResolveProperties#pNext} field. */
        public VkPhysicalDeviceDepthStencilResolveProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthStencilResolveProperties.npNext(address(), value); return this; }

    }

}