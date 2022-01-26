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
 * <p>If the {@link VkPhysicalDeviceRobustness2FeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRobustness2FeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code robustBufferAccess2} is enabled then <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> <b>must</b> also be enabled</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRobustness2FeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #robustBufferAccess2};
 *     VkBool32 {@link #robustImageAccess2};
 *     VkBool32 {@link #nullDescriptor};
 * }</code></pre>
 */
public class VkPhysicalDeviceRobustness2FeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ROBUSTBUFFERACCESS2,
        ROBUSTIMAGEACCESS2,
        NULLDESCRIPTOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTBUFFERACCESS2 = layout.offsetof(2);
        ROBUSTIMAGEACCESS2 = layout.offsetof(3);
        NULLDESCRIPTOR = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRobustness2FeaturesEXT(ByteBuffer container) {
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
    /** indicates whether buffer accesses are tightly bounds-checked against the range of the descriptor. Uniform buffers <b>must</b> be bounds-checked to the range of the descriptor, where the range is rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustUniformBufferAccessSizeAlignment">robustUniformBufferAccessSizeAlignment</a>. Storage buffers <b>must</b> be bounds-checked to the range of the descriptor, where the range is rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustStorageBufferAccessSizeAlignment">robustStorageBufferAccessSizeAlignment</a>. Out of bounds buffer loads will return zero values, and formatted loads will have <code>(0,0,1)</code> values inserted for missing G, B, or A components based on the format. */
    @NativeType("VkBool32")
    public boolean robustBufferAccess2() { return nrobustBufferAccess2(address()) != 0; }
    /** indicates whether image accesses are tightly bounds-checked against the dimensions of the image view. Out of bounds image loads will return zero values, with <code>(0,0,1)</code> values <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-conversion-to-rgba">inserted for missing G, B, or A components</a> based on the format. */
    @NativeType("VkBool32")
    public boolean robustImageAccess2() { return nrobustImageAccess2(address()) != 0; }
    /** indicates whether descriptors <b>can</b> be written with a {@link VK10#VK_NULL_HANDLE NULL_HANDLE} resource or view, which are considered valid to access and act as if the descriptor were bound to nothing. */
    @NativeType("VkBool32")
    public boolean nullDescriptor() { return nnullDescriptor(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRobustness2FeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceRobustness2FeaturesEXT sType$Default() { return sType(EXTRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRobustness2FeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #robustBufferAccess2} field. */
    public VkPhysicalDeviceRobustness2FeaturesEXT robustBufferAccess2(@NativeType("VkBool32") boolean value) { nrobustBufferAccess2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #robustImageAccess2} field. */
    public VkPhysicalDeviceRobustness2FeaturesEXT robustImageAccess2(@NativeType("VkBool32") boolean value) { nrobustImageAccess2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #nullDescriptor} field. */
    public VkPhysicalDeviceRobustness2FeaturesEXT nullDescriptor(@NativeType("VkBool32") boolean value) { nnullDescriptor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRobustness2FeaturesEXT set(
        int sType,
        long pNext,
        boolean robustBufferAccess2,
        boolean robustImageAccess2,
        boolean nullDescriptor
    ) {
        sType(sType);
        pNext(pNext);
        robustBufferAccess2(robustBufferAccess2);
        robustImageAccess2(robustImageAccess2);
        nullDescriptor(nullDescriptor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRobustness2FeaturesEXT set(VkPhysicalDeviceRobustness2FeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2FeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRobustness2FeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRobustness2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceRobustness2FeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRobustness2FeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRobustness2FeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRobustness2FeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRobustness2FeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRobustness2FeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #robustBufferAccess2}. */
    public static int nrobustBufferAccess2(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.ROBUSTBUFFERACCESS2); }
    /** Unsafe version of {@link #robustImageAccess2}. */
    public static int nrobustImageAccess2(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.ROBUSTIMAGEACCESS2); }
    /** Unsafe version of {@link #nullDescriptor}. */
    public static int nnullDescriptor(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.NULLDESCRIPTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRobustness2FeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #robustBufferAccess2(boolean) robustBufferAccess2}. */
    public static void nrobustBufferAccess2(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.ROBUSTBUFFERACCESS2, value); }
    /** Unsafe version of {@link #robustImageAccess2(boolean) robustImageAccess2}. */
    public static void nrobustImageAccess2(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.ROBUSTIMAGEACCESS2, value); }
    /** Unsafe version of {@link #nullDescriptor(boolean) nullDescriptor}. */
    public static void nnullDescriptor(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRobustness2FeaturesEXT.NULLDESCRIPTOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRobustness2FeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRobustness2FeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRobustness2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRobustness2FeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRobustness2FeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRobustness2FeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRobustness2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRobustness2FeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRobustness2FeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2FeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRobustness2FeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2FeaturesEXT#robustBufferAccess2} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccess2() { return VkPhysicalDeviceRobustness2FeaturesEXT.nrobustBufferAccess2(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2FeaturesEXT#robustImageAccess2} field. */
        @NativeType("VkBool32")
        public boolean robustImageAccess2() { return VkPhysicalDeviceRobustness2FeaturesEXT.nrobustImageAccess2(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceRobustness2FeaturesEXT#nullDescriptor} field. */
        @NativeType("VkBool32")
        public boolean nullDescriptor() { return VkPhysicalDeviceRobustness2FeaturesEXT.nnullDescriptor(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceRobustness2FeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRobustness2FeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTRobustness2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT} value to the {@link VkPhysicalDeviceRobustness2FeaturesEXT#sType} field. */
        public VkPhysicalDeviceRobustness2FeaturesEXT.Buffer sType$Default() { return sType(EXTRobustness2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2FeaturesEXT#pNext} field. */
        public VkPhysicalDeviceRobustness2FeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRobustness2FeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2FeaturesEXT#robustBufferAccess2} field. */
        public VkPhysicalDeviceRobustness2FeaturesEXT.Buffer robustBufferAccess2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRobustness2FeaturesEXT.nrobustBufferAccess2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2FeaturesEXT#robustImageAccess2} field. */
        public VkPhysicalDeviceRobustness2FeaturesEXT.Buffer robustImageAccess2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRobustness2FeaturesEXT.nrobustImageAccess2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRobustness2FeaturesEXT#nullDescriptor} field. */
        public VkPhysicalDeviceRobustness2FeaturesEXT.Buffer nullDescriptor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRobustness2FeaturesEXT.nnullDescriptor(address(), value ? 1 : 0); return this; }

    }

}