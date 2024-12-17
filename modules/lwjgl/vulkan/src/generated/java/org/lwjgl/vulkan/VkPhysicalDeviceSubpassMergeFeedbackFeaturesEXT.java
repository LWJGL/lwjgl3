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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 subpassMergeFeedback;
 * }}</pre>
 */
public class VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT extends Struct<VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBPASSMERGEFEEDBACK;

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
        SUBPASSMERGEFEEDBACK = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code subpassMergeFeedback} field. */
    @NativeType("VkBool32")
    public boolean subpassMergeFeedback() { return nsubpassMergeFeedback(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code subpassMergeFeedback} field. */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT subpassMergeFeedback(@NativeType("VkBool32") boolean value) { nsubpassMergeFeedback(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT set(
        int sType,
        long pNext,
        boolean subpassMergeFeedback
    ) {
        sType(sType);
        pNext(pNext);
        subpassMergeFeedback(subpassMergeFeedback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT set(VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT malloc() {
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT calloc() {
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT create(long address) {
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #subpassMergeFeedback}. */
    public static int nsubpassMergeFeedback(long struct) { return memGetInt(struct + VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.SUBPASSMERGEFEEDBACK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #subpassMergeFeedback(boolean) subpassMergeFeedback}. */
    public static void nsubpassMergeFeedback(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.SUBPASSMERGEFEEDBACK, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code subpassMergeFeedback} field. */
        @NativeType("VkBool32")
        public boolean subpassMergeFeedback() { return VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.nsubpassMergeFeedback(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBPASS_MERGE_FEEDBACK_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code subpassMergeFeedback} field. */
        public VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.Buffer subpassMergeFeedback(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT.nsubpassMergeFeedback(address(), value ? 1 : 0); return this; }

    }

}