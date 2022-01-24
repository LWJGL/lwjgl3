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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying pipeline libraries to use when creating a pipeline.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pLibraries} <b>must</b> have been created with {@link KHRPipelineLibrary#VK_PIPELINE_CREATE_LIBRARY_BIT_KHR PIPELINE_CREATE_LIBRARY_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineLibrary#VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code libraryCount} is not 0, {@code pLibraries} <b>must</b> be a valid pointer to an array of {@code libraryCount} valid {@code VkPipeline} handles</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRayTracingPipelineCreateInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineLibraryCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #libraryCount};
 *     VkPipeline const * {@link #pLibraries};
 * }</code></pre>
 */
public class VkPipelineLibraryCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LIBRARYCOUNT,
        PLIBRARIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LIBRARYCOUNT = layout.offsetof(2);
        PLIBRARIES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineLibraryCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineLibraryCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of pipeline libraries in {@code pLibraries}. */
    @NativeType("uint32_t")
    public int libraryCount() { return nlibraryCount(address()); }
    /** a pointer to an array of {@code VkPipeline} structures specifying pipeline libraries to use when creating a pipeline. */
    @Nullable
    @NativeType("VkPipeline const *")
    public LongBuffer pLibraries() { return npLibraries(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineLibraryCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineLibrary#VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkPipelineLibraryCreateInfoKHR sType$Default() { return sType(KHRPipelineLibrary.VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineLibraryCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pLibraries} field. */
    public VkPipelineLibraryCreateInfoKHR pLibraries(@Nullable @NativeType("VkPipeline const *") LongBuffer value) { npLibraries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineLibraryCreateInfoKHR set(
        int sType,
        long pNext,
        @Nullable LongBuffer pLibraries
    ) {
        sType(sType);
        pNext(pNext);
        pLibraries(pLibraries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineLibraryCreateInfoKHR set(VkPipelineLibraryCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineLibraryCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineLibraryCreateInfoKHR malloc() {
        return wrap(VkPipelineLibraryCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineLibraryCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineLibraryCreateInfoKHR calloc() {
        return wrap(VkPipelineLibraryCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineLibraryCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineLibraryCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineLibraryCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineLibraryCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineLibraryCreateInfoKHR create(long address) {
        return wrap(VkPipelineLibraryCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineLibraryCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineLibraryCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkPipelineLibraryCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLibraryCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLibraryCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLibraryCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLibraryCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineLibraryCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineLibraryCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineLibraryCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineLibraryCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineLibraryCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineLibraryCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkPipelineLibraryCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineLibraryCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineLibraryCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkPipelineLibraryCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineLibraryCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineLibraryCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineLibraryCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineLibraryCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineLibraryCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineLibraryCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #libraryCount}. */
    public static int nlibraryCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineLibraryCreateInfoKHR.LIBRARYCOUNT); }
    /** Unsafe version of {@link #pLibraries() pLibraries}. */
    @Nullable public static LongBuffer npLibraries(long struct) { return memLongBufferSafe(memGetAddress(struct + VkPipelineLibraryCreateInfoKHR.PLIBRARIES), nlibraryCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineLibraryCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineLibraryCreateInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code libraryCount} field of the specified {@code struct}. */
    public static void nlibraryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineLibraryCreateInfoKHR.LIBRARYCOUNT, value); }
    /** Unsafe version of {@link #pLibraries(LongBuffer) pLibraries}. */
    public static void npLibraries(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkPipelineLibraryCreateInfoKHR.PLIBRARIES, memAddressSafe(value)); nlibraryCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nlibraryCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineLibraryCreateInfoKHR.PLIBRARIES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineLibraryCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineLibraryCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineLibraryCreateInfoKHR ELEMENT_FACTORY = VkPipelineLibraryCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineLibraryCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineLibraryCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineLibraryCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineLibraryCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineLibraryCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineLibraryCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineLibraryCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineLibraryCreateInfoKHR#libraryCount} field. */
        @NativeType("uint32_t")
        public int libraryCount() { return VkPipelineLibraryCreateInfoKHR.nlibraryCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkPipelineLibraryCreateInfoKHR#pLibraries} field. */
        @Nullable
        @NativeType("VkPipeline const *")
        public LongBuffer pLibraries() { return VkPipelineLibraryCreateInfoKHR.npLibraries(address()); }

        /** Sets the specified value to the {@link VkPipelineLibraryCreateInfoKHR#sType} field. */
        public VkPipelineLibraryCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineLibraryCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineLibrary#VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR} value to the {@link VkPipelineLibraryCreateInfoKHR#sType} field. */
        public VkPipelineLibraryCreateInfoKHR.Buffer sType$Default() { return sType(KHRPipelineLibrary.VK_STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkPipelineLibraryCreateInfoKHR#pNext} field. */
        public VkPipelineLibraryCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineLibraryCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkPipelineLibraryCreateInfoKHR#pLibraries} field. */
        public VkPipelineLibraryCreateInfoKHR.Buffer pLibraries(@Nullable @NativeType("VkPipeline const *") LongBuffer value) { VkPipelineLibraryCreateInfoKHR.npLibraries(address(), value); return this; }

    }

}