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
 * Structure describing the provoking vertex features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <p>When {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} is in the {@code pNext} chain of {@link VkDeviceCreateInfo} but the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback feature</a> is not enabled, the value of {@code transformFeedbackPreservesProvokingVertex} is ignored.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceProvokingVertexFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #provokingVertexLast};
 *     VkBool32 {@link #transformFeedbackPreservesProvokingVertex};
 * }</code></pre>
 */
public class VkPhysicalDeviceProvokingVertexFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROVOKINGVERTEXLAST,
        TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX;

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
        PROVOKINGVERTEXLAST = layout.offsetof(2);
        TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether the implementation supports the {@link EXTProvokingVertex#VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT} provoking vertex mode ({@code VkProvokingVertexModeEXT}) for flat shading. */
    @NativeType("VkBool32")
    public boolean provokingVertexLast() { return nprovokingVertexLast(address()) != 0; }
    /** indicates that the order of vertices within each primitive written by transform feedback will preserve the provoking vertex. This does not apply to triangle fan primitives when <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-transformFeedbackPreservesTriangleFanProvokingVertex">{@code transformFeedbackPreservesTriangleFanProvokingVertex}</a> is {@link VK10#VK_FALSE FALSE}. {@code transformFeedbackPreservesProvokingVertex} <b>must</b> be {@link VK10#VK_FALSE FALSE} when the {@link EXTTransformFeedback VK_EXT_transform_feedback} extension is not supported. */
    @NativeType("VkBool32")
    public boolean transformFeedbackPreservesProvokingVertex() { return ntransformFeedbackPreservesProvokingVertex(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #provokingVertexLast} field. */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT provokingVertexLast(@NativeType("VkBool32") boolean value) { nprovokingVertexLast(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #transformFeedbackPreservesProvokingVertex} field. */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT transformFeedbackPreservesProvokingVertex(@NativeType("VkBool32") boolean value) { ntransformFeedbackPreservesProvokingVertex(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT set(
        int sType,
        long pNext,
        boolean provokingVertexLast,
        boolean transformFeedbackPreservesProvokingVertex
    ) {
        sType(sType);
        pNext(pNext);
        provokingVertexLast(provokingVertexLast);
        transformFeedbackPreservesProvokingVertex(transformFeedbackPreservesProvokingVertex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceProvokingVertexFeaturesEXT set(VkPhysicalDeviceProvokingVertexFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceProvokingVertexFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #provokingVertexLast}. */
    public static int nprovokingVertexLast(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.PROVOKINGVERTEXLAST); }
    /** Unsafe version of {@link #transformFeedbackPreservesProvokingVertex}. */
    public static int ntransformFeedbackPreservesProvokingVertex(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #provokingVertexLast(boolean) provokingVertexLast}. */
    public static void nprovokingVertexLast(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.PROVOKINGVERTEXLAST, value); }
    /** Unsafe version of {@link #transformFeedbackPreservesProvokingVertex(boolean) transformFeedbackPreservesProvokingVertex}. */
    public static void ntransformFeedbackPreservesProvokingVertex(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProvokingVertexFeaturesEXT.TRANSFORMFEEDBACKPRESERVESPROVOKINGVERTEX, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProvokingVertexFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProvokingVertexFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceProvokingVertexFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceProvokingVertexFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceProvokingVertexFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#provokingVertexLast} field. */
        @NativeType("VkBool32")
        public boolean provokingVertexLast() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.nprovokingVertexLast(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#transformFeedbackPreservesProvokingVertex} field. */
        @NativeType("VkBool32")
        public boolean transformFeedbackPreservesProvokingVertex() { return VkPhysicalDeviceProvokingVertexFeaturesEXT.ntransformFeedbackPreservesProvokingVertex(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#sType} field. */
        public VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTProvokingVertex#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT} value to the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#sType} field. */
        public VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer sType$Default() { return sType(EXTProvokingVertex.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#provokingVertexLast} field. */
        public VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer provokingVertexLast(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.nprovokingVertexLast(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceProvokingVertexFeaturesEXT#transformFeedbackPreservesProvokingVertex} field. */
        public VkPhysicalDeviceProvokingVertexFeaturesEXT.Buffer transformFeedbackPreservesProvokingVertex(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceProvokingVertexFeaturesEXT.ntransformFeedbackPreservesProvokingVertex(address(), value ? 1 : 0); return this; }

    }

}