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
 * Structure describing transform feedback features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTTransformFeedback#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code transformFeedback} &ndash; indicates whether the implementation supports transform feedback and shader modules <b>can</b> declare the {@code TransformFeedback} capability.</li>
 * <li>{@code geometryStreams} &ndash; indicates whether the implementation supports the {@code GeometryStreams} SPIR-V capability.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTransformFeedbackFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 transformFeedback;
 *     VkBool32 geometryStreams;
 * }</code></pre>
 */
public class VkPhysicalDeviceTransformFeedbackFeaturesEXT extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code transformFeedback} field. */
    @NativeType("VkBool32")
    public boolean transformFeedback() { return ntransformFeedback(address()) != 0; }
    /** Returns the value of the {@code geometryStreams} field. */
    @NativeType("VkBool32")
    public boolean geometryStreams() { return ngeometryStreams(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
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
        return wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTransformFeedbackFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #transformFeedback}. */
    public static int ntransformFeedback(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.TRANSFORMFEEDBACK); }
    /** Unsafe version of {@link #geometryStreams}. */
    public static int ngeometryStreams(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.GEOMETRYSTREAMS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #transformFeedback(boolean) transformFeedback}. */
    public static void ntransformFeedback(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.TRANSFORMFEEDBACK, value); }
    /** Unsafe version of {@link #geometryStreams(boolean) geometryStreams}. */
    public static void ngeometryStreams(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTransformFeedbackFeaturesEXT.GEOMETRYSTREAMS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTransformFeedbackFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTransformFeedbackFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTransformFeedbackFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTransformFeedbackFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTransformFeedbackFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code transformFeedback} field. */
        @NativeType("VkBool32")
        public boolean transformFeedback() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.ntransformFeedback(address()) != 0; }
        /** Returns the value of the {@code geometryStreams} field. */
        @NativeType("VkBool32")
        public boolean geometryStreams() { return VkPhysicalDeviceTransformFeedbackFeaturesEXT.ngeometryStreams(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code transformFeedback} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer transformFeedback(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.ntransformFeedback(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code geometryStreams} field. */
        public VkPhysicalDeviceTransformFeedbackFeaturesEXT.Buffer geometryStreams(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTransformFeedbackFeaturesEXT.ngeometryStreams(address(), value ? 1 : 0); return this; }

    }

}