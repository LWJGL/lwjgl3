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
 * struct VkPhysicalDeviceTransformFeedbackFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 transformFeedback;
 *     VkBool32 geometryStreams;
 * }}</pre>
 */
public class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends Struct<VkPhysicalDeviceTransformFeedbackFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TRANSFORMFEEDBACK,
        GEOMETRYSTREAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TRANSFORMFEEDBACK = layout.offsetof(2);
        GEOMETRYSTREAMS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceTransformFeedbackFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTransformFeedbackFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code transformFeedback} field. */
    @NativeType("VkBool32")
    public boolean transformFeedback() { return ntransformFeedback(address()) != 0; }
    /** @return the value of the {@code geometryStreams} field. */
    @NativeType("VkBool32")
    public boolean geometryStreams() { return ngeometryStreams(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code transformFeedback} field. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT transformFeedback(@NativeType("VkBool32") boolean value) { ntransformFeedback(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code geometryStreams} field. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT geometryStreams(@NativeType("VkBool32") boolean value) { ngeometryStreams(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT set(
        int sType,
        long pNext,
        boolean transformFeedback,
        boolean geometryStreams
    ) {
        sType(sType);
        pNext(pNext);
        transformFeedback(transformFeedback);
        geometryStreams(geometryStreams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT set(VkPhysicalDeviceTransformFeedbackFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT malloc() {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT calloc() {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT create(long address) {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTransformFeedbackFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTransformFeedbackFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #transformFeedback}. */
    public static int ntransformFeedback(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.TRANSFORMFEEDBACK); }
    /** Unsafe version of {@link #geometryStreams}. */
    public static int ngeometryStreams(long struct) { return memGetInt(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.GEOMETRYSTREAMS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #transformFeedback(boolean) transformFeedback}. */
    public static void ntransformFeedback(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.TRANSFORMFEEDBACK, value); }
    /** Unsafe version of {@link #geometryStreams(boolean) geometryStreams}. */
    public static void ngeometryStreams(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.GEOMETRYSTREAMS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTransformFeedbackFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTransformFeedbackFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTransformFeedbackFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTransformFeedbackFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code transformFeedback} field. */
        @NativeType("VkBool32")
        public boolean transformFeedback() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.ntransformFeedback(address()) != 0; }
        /** @return the value of the {@code geometryStreams} field. */
        @NativeType("VkBool32")
        public boolean geometryStreams() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.ngeometryStreams(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer sType$Default() { return sType(EXTTransformFeedback.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code transformFeedback} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer transformFeedback(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.ntransformFeedback(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code geometryStreams} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer geometryStreams(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.ngeometryStreams(address(), value ? 1 : 0); return this; }

    }

}