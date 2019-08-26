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
 * Structure describing a pipeline executable to query for associated statistics or internal representations.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code executableIndex} <b>must</b> be less than the number of executables associated with {@code pipeline} as returned in the {@code pExecutableCount} parameter of {@code vkGetPipelineExecutablePropertiesKHR}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPipelineExecutableProperties#vkGetPipelineExecutableInternalRepresentationsKHR GetPipelineExecutableInternalRepresentationsKHR}, {@link KHRPipelineExecutableProperties#vkGetPipelineExecutableStatisticsKHR GetPipelineExecutableStatisticsKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code pipeline} &ndash; the pipeline to query.</li>
 * <li>{@code executableIndex} &ndash; the index of the executable to query in the array of executable properties returned by {@link KHRPipelineExecutableProperties#vkGetPipelineExecutablePropertiesKHR GetPipelineExecutablePropertiesKHR}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineExecutableInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipeline pipeline;
 *     uint32_t executableIndex;
 * }</code></pre>
 */
public class VkPipelineExecutableInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINE,
        EXECUTABLEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINE = layout.offsetof(2);
        EXECUTABLEINDEX = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineExecutableInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutableInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }
    /** Returns the value of the {@code executableIndex} field. */
    @NativeType("uint32_t")
    public int executableIndex() { return nexecutableIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineExecutableInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineExecutableInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkPipelineExecutableInfoKHR pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }
    /** Sets the specified value to the {@code executableIndex} field. */
    public VkPipelineExecutableInfoKHR executableIndex(@NativeType("uint32_t") int value) { nexecutableIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineExecutableInfoKHR set(
        int sType,
        long pNext,
        long pipeline,
        int executableIndex
    ) {
        sType(sType);
        pNext(pNext);
        pipeline(pipeline);
        executableIndex(executableIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineExecutableInfoKHR set(VkPipelineExecutableInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInfoKHR malloc() {
        return wrap(VkPipelineExecutableInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableInfoKHR calloc() {
        return wrap(VkPipelineExecutableInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineExecutableInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineExecutableInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance for the specified memory address. */
    public static VkPipelineExecutableInfoKHR create(long address) {
        return wrap(VkPipelineExecutableInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineExecutableInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineExecutableInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineExecutableInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineExecutableInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkPipelineExecutableInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineExecutableInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkPipelineExecutableInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineExecutableInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return UNSAFE.getLong(null, struct + VkPipelineExecutableInfoKHR.PIPELINE); }
    /** Unsafe version of {@link #executableIndex}. */
    public static int nexecutableIndex(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableInfoKHR.EXECUTABLEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineExecutableInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineExecutableInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkPipelineExecutableInfoKHR.PIPELINE, value); }
    /** Unsafe version of {@link #executableIndex(int) executableIndex}. */
    public static void nexecutableIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineExecutableInfoKHR.EXECUTABLEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineExecutableInfoKHR ELEMENT_FACTORY = VkPipelineExecutableInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineExecutableInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutableInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineExecutableInfoKHR.npNext(address()); }
        /** Returns the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkPipelineExecutableInfoKHR.npipeline(address()); }
        /** Returns the value of the {@code executableIndex} field. */
        @NativeType("uint32_t")
        public int executableIndex() { return VkPipelineExecutableInfoKHR.nexecutableIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineExecutableInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutableInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineExecutableInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineExecutableInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkPipelineExecutableInfoKHR.Buffer pipeline(@NativeType("VkPipeline") long value) { VkPipelineExecutableInfoKHR.npipeline(address(), value); return this; }
        /** Sets the specified value to the {@code executableIndex} field. */
        public VkPipelineExecutableInfoKHR.Buffer executableIndex(@NativeType("uint32_t") int value) { VkPipelineExecutableInfoKHR.nexecutableIndex(address(), value); return this; }

    }

}