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
 * Structure describing the texel buffer alignment features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTTexelBufferAlignment#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #texelBufferAlignment};
 * }</code></pre>
 */
public class VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TEXELBUFFERALIGNMENT;

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
        TEXELBUFFERALIGNMENT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether the implementation uses more specific alignment requirements advertised in {@link VkPhysicalDeviceTexelBufferAlignmentProperties} rather than {@link VkPhysicalDeviceLimits}{@code ::minTexelBufferOffsetAlignment}. */
    @NativeType("VkBool32")
    public boolean texelBufferAlignment() { return ntexelBufferAlignment(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTTexelBufferAlignment#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT sType$Default() { return sType(EXTTexelBufferAlignment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #texelBufferAlignment} field. */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT texelBufferAlignment(@NativeType("VkBool32") boolean value) { ntexelBufferAlignment(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT set(
        int sType,
        long pNext,
        boolean texelBufferAlignment
    ) {
        sType(sType);
        pNext(pNext);
        texelBufferAlignment(texelBufferAlignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT set(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #texelBufferAlignment}. */
    public static int ntexelBufferAlignment(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.TEXELBUFFERALIGNMENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #texelBufferAlignment(boolean) texelBufferAlignment}. */
    public static void ntexelBufferAlignment(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.TEXELBUFFERALIGNMENT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#texelBufferAlignment} field. */
        @NativeType("VkBool32")
        public boolean texelBufferAlignment() { return VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.ntexelBufferAlignment(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#sType} field. */
        public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTTexelBufferAlignment#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT} value to the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#sType} field. */
        public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer sType$Default() { return sType(EXTTexelBufferAlignment.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT#texelBufferAlignment} field. */
        public VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.Buffer texelBufferAlignment(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT.ntexelBufferAlignment(address(), value ? 1 : 0); return this; }

    }

}