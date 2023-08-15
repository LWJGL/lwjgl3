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
 * Structure describing support for primitives generated query.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPrimitivesGeneratedQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #primitivesGeneratedQuery};
 *     VkBool32 {@link #primitivesGeneratedQueryWithRasterizerDiscard};
 *     VkBool32 {@link #primitivesGeneratedQueryWithNonZeroStreams};
 * }</code></pre>
 */
public class VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT extends Struct<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIMITIVESGENERATEDQUERY,
        PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD,
        PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS;

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
        PRIMITIVESGENERATEDQUERY = layout.offsetof(2);
        PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD = layout.offsetof(3);
        PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS = layout.offsetof(4);
    }

    protected VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports the {@link EXTPrimitivesGeneratedQuery#VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT QUERY_TYPE_PRIMITIVES_GENERATED_EXT} query type. */
    @NativeType("VkBool32")
    public boolean primitivesGeneratedQuery() { return nprimitivesGeneratedQuery(address()) != 0; }
    /** indicates whether the implementation supports this query when <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-discard">rasterization discard</a> is enabled. */
    @NativeType("VkBool32")
    public boolean primitivesGeneratedQueryWithRasterizerDiscard() { return nprimitivesGeneratedQueryWithRasterizerDiscard(address()) != 0; }
    /** indicates whether the implementation supports this query with a non-zero index in {@link EXTTransformFeedback#vkCmdBeginQueryIndexedEXT CmdBeginQueryIndexedEXT}. */
    @NativeType("VkBool32")
    public boolean primitivesGeneratedQueryWithNonZeroStreams() { return nprimitivesGeneratedQueryWithNonZeroStreams(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPrimitivesGeneratedQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType$Default() { return sType(EXTPrimitivesGeneratedQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #primitivesGeneratedQuery} field. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQuery(@NativeType("VkBool32") boolean value) { nprimitivesGeneratedQuery(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #primitivesGeneratedQueryWithRasterizerDiscard} field. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscard(@NativeType("VkBool32") boolean value) { nprimitivesGeneratedQueryWithRasterizerDiscard(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #primitivesGeneratedQueryWithNonZeroStreams} field. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreams(@NativeType("VkBool32") boolean value) { nprimitivesGeneratedQueryWithNonZeroStreams(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT set(
        int sType,
        long pNext,
        boolean primitivesGeneratedQuery,
        boolean primitivesGeneratedQueryWithRasterizerDiscard,
        boolean primitivesGeneratedQueryWithNonZeroStreams
    ) {
        sType(sType);
        pNext(pNext);
        primitivesGeneratedQuery(primitivesGeneratedQuery);
        primitivesGeneratedQueryWithRasterizerDiscard(primitivesGeneratedQueryWithRasterizerDiscard);
        primitivesGeneratedQueryWithNonZeroStreams(primitivesGeneratedQueryWithNonZeroStreams);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT set(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT malloc() {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT calloc() {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT create(long address) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #primitivesGeneratedQuery}. */
    public static int nprimitivesGeneratedQuery(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PRIMITIVESGENERATEDQUERY); }
    /** Unsafe version of {@link #primitivesGeneratedQueryWithRasterizerDiscard}. */
    public static int nprimitivesGeneratedQueryWithRasterizerDiscard(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD); }
    /** Unsafe version of {@link #primitivesGeneratedQueryWithNonZeroStreams}. */
    public static int nprimitivesGeneratedQueryWithNonZeroStreams(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #primitivesGeneratedQuery(boolean) primitivesGeneratedQuery}. */
    public static void nprimitivesGeneratedQuery(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PRIMITIVESGENERATEDQUERY, value); }
    /** Unsafe version of {@link #primitivesGeneratedQueryWithRasterizerDiscard(boolean) primitivesGeneratedQueryWithRasterizerDiscard}. */
    public static void nprimitivesGeneratedQueryWithRasterizerDiscard(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD, value); }
    /** Unsafe version of {@link #primitivesGeneratedQueryWithNonZeroStreams(boolean) primitivesGeneratedQueryWithNonZeroStreams}. */
    public static void nprimitivesGeneratedQueryWithNonZeroStreams(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#primitivesGeneratedQuery} field. */
        @NativeType("VkBool32")
        public boolean primitivesGeneratedQuery() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQuery(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#primitivesGeneratedQueryWithRasterizerDiscard} field. */
        @NativeType("VkBool32")
        public boolean primitivesGeneratedQueryWithRasterizerDiscard() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithRasterizerDiscard(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#primitivesGeneratedQueryWithNonZeroStreams} field. */
        @NativeType("VkBool32")
        public boolean primitivesGeneratedQueryWithNonZeroStreams() { return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithNonZeroStreams(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#sType} field. */
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPrimitivesGeneratedQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT} value to the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#sType} field. */
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer sType$Default() { return sType(EXTPrimitivesGeneratedQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#pNext} field. */
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#primitivesGeneratedQuery} field. */
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer primitivesGeneratedQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQuery(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#primitivesGeneratedQueryWithRasterizerDiscard} field. */
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer primitivesGeneratedQueryWithRasterizerDiscard(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithRasterizerDiscard(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT#primitivesGeneratedQueryWithNonZeroStreams} field. */
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.Buffer primitivesGeneratedQueryWithNonZeroStreams(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithNonZeroStreams(address(), value ? 1 : 0); return this; }

    }

}