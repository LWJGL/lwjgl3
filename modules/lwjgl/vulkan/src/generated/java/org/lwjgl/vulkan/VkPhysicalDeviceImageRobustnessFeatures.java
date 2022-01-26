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
 * Structure describing the out-of-bounds behavior for an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImageRobustnessFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceImageRobustnessFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageRobustnessFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #robustImageAccess};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageRobustnessFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTIMAGEACCESS;

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
        ROBUSTIMAGEACCESS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageRobustnessFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageRobustnessFeatures(ByteBuffer container) {
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
    /** indicates whether image accesses are tightly bounds-checked against the dimensions of the image view. <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-input-validation">Invalid texels</a> resulting from out of bounds image loads will be replaced as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-texel-replacement">Texel Replacement</a>, with either <code>(0,0,1)</code> or <code>(0,0,0)</code> values inserted for missing G, B, or A components based on the format. */
    @NativeType("VkBool32")
    public boolean robustImageAccess() { return nrobustImageAccess(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageRobustnessFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageRobustnessFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageRobustnessFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #robustImageAccess} field. */
    public VkPhysicalDeviceImageRobustnessFeatures robustImageAccess(@NativeType("VkBool32") boolean value) { nrobustImageAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageRobustnessFeatures set(
        int sType,
        long pNext,
        boolean robustImageAccess
    ) {
        sType(sType);
        pNext(pNext);
        robustImageAccess(robustImageAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageRobustnessFeatures set(VkPhysicalDeviceImageRobustnessFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageRobustnessFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageRobustnessFeatures malloc() {
        return wrap(VkPhysicalDeviceImageRobustnessFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageRobustnessFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageRobustnessFeatures calloc() {
        return wrap(VkPhysicalDeviceImageRobustnessFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageRobustnessFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageRobustnessFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceImageRobustnessFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageRobustnessFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceImageRobustnessFeatures create(long address) {
        return wrap(VkPhysicalDeviceImageRobustnessFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageRobustnessFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceImageRobustnessFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageRobustnessFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageRobustnessFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageRobustnessFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageRobustnessFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageRobustnessFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageRobustnessFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageRobustnessFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageRobustnessFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageRobustnessFeatures.PNEXT); }
    /** Unsafe version of {@link #robustImageAccess}. */
    public static int nrobustImageAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageRobustnessFeatures.ROBUSTIMAGEACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageRobustnessFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageRobustnessFeatures.PNEXT, value); }
    /** Unsafe version of {@link #robustImageAccess(boolean) robustImageAccess}. */
    public static void nrobustImageAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageRobustnessFeatures.ROBUSTIMAGEACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageRobustnessFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageRobustnessFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageRobustnessFeatures ELEMENT_FACTORY = VkPhysicalDeviceImageRobustnessFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageRobustnessFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageRobustnessFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceImageRobustnessFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageRobustnessFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageRobustnessFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageRobustnessFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageRobustnessFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageRobustnessFeatures#robustImageAccess} field. */
        @NativeType("VkBool32")
        public boolean robustImageAccess() { return VkPhysicalDeviceImageRobustnessFeatures.nrobustImageAccess(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageRobustnessFeatures#sType} field. */
        public VkPhysicalDeviceImageRobustnessFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageRobustnessFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES} value to the {@link VkPhysicalDeviceImageRobustnessFeatures#sType} field. */
        public VkPhysicalDeviceImageRobustnessFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ROBUSTNESS_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageRobustnessFeatures#pNext} field. */
        public VkPhysicalDeviceImageRobustnessFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageRobustnessFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageRobustnessFeatures#robustImageAccess} field. */
        public VkPhysicalDeviceImageRobustnessFeatures.Buffer robustImageAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageRobustnessFeatures.nrobustImageAccess(address(), value ? 1 : 0); return this; }

    }

}