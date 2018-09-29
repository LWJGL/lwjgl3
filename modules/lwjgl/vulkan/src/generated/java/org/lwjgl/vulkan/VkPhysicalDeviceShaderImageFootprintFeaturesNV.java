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
 * Structure describing shader image footprint features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-footprint">Texel Footprint Evaluation</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShaderImageFootprint#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code imageFootprint} &ndash; specifies whether the implementation supports the {@code ImageFootprintNV} SPIR-V capability.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderImageFootprintFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imageFootprint;
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderImageFootprintFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEFOOTPRINT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEFOOTPRINT = layout.offsetof(2);
    }

    VkPhysicalDeviceShaderImageFootprintFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code imageFootprint} field. */
    @NativeType("VkBool32")
    public boolean imageFootprint() { return nimageFootprint(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageFootprint} field. */
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV imageFootprint(@NativeType("VkBool32") boolean value) { nimageFootprint(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV set(
        int sType,
        long pNext,
        boolean imageFootprint
    ) {
        sType(sType);
        pNext(pNext);
        imageFootprint(imageFootprint);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderImageFootprintFeaturesNV set(VkPhysicalDeviceShaderImageFootprintFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV create() {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV create(long address) {
        return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderImageFootprintFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderImageFootprintFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #imageFootprint}. */
    public static int nimageFootprint(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderImageFootprintFeaturesNV.IMAGEFOOTPRINT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderImageFootprintFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderImageFootprintFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #imageFootprint(boolean) imageFootprint}. */
    public static void nimageFootprint(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderImageFootprintFeaturesNV.IMAGEFOOTPRINT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderImageFootprintFeaturesNV, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderImageFootprintFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPhysicalDeviceShaderImageFootprintFeaturesNV newInstance(long address) {
            return new VkPhysicalDeviceShaderImageFootprintFeaturesNV(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderImageFootprintFeaturesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderImageFootprintFeaturesNV.npNext(address()); }
        /** Returns the value of the {@code imageFootprint} field. */
        @NativeType("VkBool32")
        public boolean imageFootprint() { return VkPhysicalDeviceShaderImageFootprintFeaturesNV.nimageFootprint(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderImageFootprintFeaturesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderImageFootprintFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageFootprint} field. */
        public VkPhysicalDeviceShaderImageFootprintFeaturesNV.Buffer imageFootprint(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderImageFootprintFeaturesNV.nimageFootprint(address(), value ? 1 : 0); return this; }

    }

}