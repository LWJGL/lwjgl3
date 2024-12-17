/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct ktxVulkanTexture_subAllocatorCallbacks {
 *     void * (* allocMemFuncPtr) (VkMemoryAllocateInfo * allocInfo, VkMemoryRequirements * memReq, uint64_t * pageCount);
 *     void * (* bindBufferFuncPtr) (VkBuffer buffer, uint64_t allocId);
 *     void * (* bindImageFuncPtr) (VkImage image, uint64_t allocId);
 *     void * (* memoryMapFuncPtr) (uint64_t allocId, uint64_t pageNumber, VkDeviceSize * mapLength, void ** dataPtr);
 *     void * (* memoryUnmapFuncPtr) (uint64_t allocId, uint64_t pageNumber);
 *     void * (* freeMemFuncPtr) (uint64_t allocId);
 * }}</pre>
 */
public class ktxVulkanTexture_subAllocatorCallbacks extends Struct<ktxVulkanTexture_subAllocatorCallbacks> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOCMEMFUNCPTR,
        BINDBUFFERFUNCPTR,
        BINDIMAGEFUNCPTR,
        MEMORYMAPFUNCPTR,
        MEMORYUNMAPFUNCPTR,
        FREEMEMFUNCPTR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ALLOCMEMFUNCPTR = layout.offsetof(0);
        BINDBUFFERFUNCPTR = layout.offsetof(1);
        BINDIMAGEFUNCPTR = layout.offsetof(2);
        MEMORYMAPFUNCPTR = layout.offsetof(3);
        MEMORYUNMAPFUNCPTR = layout.offsetof(4);
        FREEMEMFUNCPTR = layout.offsetof(5);
    }

    protected ktxVulkanTexture_subAllocatorCallbacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxVulkanTexture_subAllocatorCallbacks create(long address, @Nullable ByteBuffer container) {
        return new ktxVulkanTexture_subAllocatorCallbacks(address, container);
    }

    /**
     * Creates a {@code ktxVulkanTexture_subAllocatorCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxVulkanTexture_subAllocatorCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code allocMemFuncPtr} field. */
    @NativeType("void * (*) (VkMemoryAllocateInfo *, VkMemoryRequirements *, uint64_t *)")
    public ktxVulkanTexture_subAllocatorAllocMemFuncPtr allocMemFuncPtr() { return nallocMemFuncPtr(address()); }
    /** @return the value of the {@code bindBufferFuncPtr} field. */
    @NativeType("void * (*) (VkBuffer, uint64_t)")
    public ktxVulkanTexture_subAllocatorBindBufferFuncPtr bindBufferFuncPtr() { return nbindBufferFuncPtr(address()); }
    /** @return the value of the {@code bindImageFuncPtr} field. */
    @NativeType("void * (*) (VkImage, uint64_t)")
    public ktxVulkanTexture_subAllocatorBindImageFuncPtr bindImageFuncPtr() { return nbindImageFuncPtr(address()); }
    /** @return the value of the {@code memoryMapFuncPtr} field. */
    @NativeType("void * (*) (uint64_t, uint64_t, VkDeviceSize *, void **)")
    public ktxVulkanTexture_subAllocatorMemoryMapFuncPtr memoryMapFuncPtr() { return nmemoryMapFuncPtr(address()); }
    /** @return the value of the {@code memoryUnmapFuncPtr} field. */
    @NativeType("void * (*) (uint64_t, uint64_t)")
    public ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr memoryUnmapFuncPtr() { return nmemoryUnmapFuncPtr(address()); }
    /** @return the value of the {@code freeMemFuncPtr} field. */
    @NativeType("void * (*) (uint64_t)")
    public ktxVulkanTexture_subAllocatorFreeMemFuncPtr freeMemFuncPtr() { return nfreeMemFuncPtr(address()); }

    /** Sets the specified value to the {@code allocMemFuncPtr} field. */
    public ktxVulkanTexture_subAllocatorCallbacks allocMemFuncPtr(@NativeType("void * (*) (VkMemoryAllocateInfo *, VkMemoryRequirements *, uint64_t *)") ktxVulkanTexture_subAllocatorAllocMemFuncPtrI value) { nallocMemFuncPtr(address(), value); return this; }
    /** Sets the specified value to the {@code bindBufferFuncPtr} field. */
    public ktxVulkanTexture_subAllocatorCallbacks bindBufferFuncPtr(@NativeType("void * (*) (VkBuffer, uint64_t)") ktxVulkanTexture_subAllocatorBindBufferFuncPtrI value) { nbindBufferFuncPtr(address(), value); return this; }
    /** Sets the specified value to the {@code bindImageFuncPtr} field. */
    public ktxVulkanTexture_subAllocatorCallbacks bindImageFuncPtr(@NativeType("void * (*) (VkImage, uint64_t)") ktxVulkanTexture_subAllocatorBindImageFuncPtrI value) { nbindImageFuncPtr(address(), value); return this; }
    /** Sets the specified value to the {@code memoryMapFuncPtr} field. */
    public ktxVulkanTexture_subAllocatorCallbacks memoryMapFuncPtr(@NativeType("void * (*) (uint64_t, uint64_t, VkDeviceSize *, void **)") ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI value) { nmemoryMapFuncPtr(address(), value); return this; }
    /** Sets the specified value to the {@code memoryUnmapFuncPtr} field. */
    public ktxVulkanTexture_subAllocatorCallbacks memoryUnmapFuncPtr(@NativeType("void * (*) (uint64_t, uint64_t)") ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI value) { nmemoryUnmapFuncPtr(address(), value); return this; }
    /** Sets the specified value to the {@code freeMemFuncPtr} field. */
    public ktxVulkanTexture_subAllocatorCallbacks freeMemFuncPtr(@NativeType("void * (*) (uint64_t)") ktxVulkanTexture_subAllocatorFreeMemFuncPtrI value) { nfreeMemFuncPtr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ktxVulkanTexture_subAllocatorCallbacks set(
        ktxVulkanTexture_subAllocatorAllocMemFuncPtrI allocMemFuncPtr,
        ktxVulkanTexture_subAllocatorBindBufferFuncPtrI bindBufferFuncPtr,
        ktxVulkanTexture_subAllocatorBindImageFuncPtrI bindImageFuncPtr,
        ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI memoryMapFuncPtr,
        ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI memoryUnmapFuncPtr,
        ktxVulkanTexture_subAllocatorFreeMemFuncPtrI freeMemFuncPtr
    ) {
        allocMemFuncPtr(allocMemFuncPtr);
        bindBufferFuncPtr(bindBufferFuncPtr);
        bindImageFuncPtr(bindImageFuncPtr);
        memoryMapFuncPtr(memoryMapFuncPtr);
        memoryUnmapFuncPtr(memoryUnmapFuncPtr);
        freeMemFuncPtr(freeMemFuncPtr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxVulkanTexture_subAllocatorCallbacks set(ktxVulkanTexture_subAllocatorCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxVulkanTexture_subAllocatorCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxVulkanTexture_subAllocatorCallbacks malloc() {
        return new ktxVulkanTexture_subAllocatorCallbacks(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanTexture_subAllocatorCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxVulkanTexture_subAllocatorCallbacks calloc() {
        return new ktxVulkanTexture_subAllocatorCallbacks(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanTexture_subAllocatorCallbacks} instance allocated with {@link BufferUtils}. */
    public static ktxVulkanTexture_subAllocatorCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxVulkanTexture_subAllocatorCallbacks(memAddress(container), container);
    }

    /** Returns a new {@code ktxVulkanTexture_subAllocatorCallbacks} instance for the specified memory address. */
    public static ktxVulkanTexture_subAllocatorCallbacks create(long address) {
        return new ktxVulkanTexture_subAllocatorCallbacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ktxVulkanTexture_subAllocatorCallbacks createSafe(long address) {
        return address == NULL ? null : new ktxVulkanTexture_subAllocatorCallbacks(address, null);
    }

    /**
     * Returns a new {@link ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture_subAllocatorCallbacks.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture_subAllocatorCallbacks.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture_subAllocatorCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture_subAllocatorCallbacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ktxVulkanTexture_subAllocatorCallbacks.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxVulkanTexture_subAllocatorCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanTexture_subAllocatorCallbacks malloc(MemoryStack stack) {
        return new ktxVulkanTexture_subAllocatorCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxVulkanTexture_subAllocatorCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanTexture_subAllocatorCallbacks calloc(MemoryStack stack) {
        return new ktxVulkanTexture_subAllocatorCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture_subAllocatorCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanTexture_subAllocatorCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #allocMemFuncPtr}. */
    public static ktxVulkanTexture_subAllocatorAllocMemFuncPtr nallocMemFuncPtr(long struct) { return ktxVulkanTexture_subAllocatorAllocMemFuncPtr.create(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.ALLOCMEMFUNCPTR)); }
    /** Unsafe version of {@link #bindBufferFuncPtr}. */
    public static ktxVulkanTexture_subAllocatorBindBufferFuncPtr nbindBufferFuncPtr(long struct) { return ktxVulkanTexture_subAllocatorBindBufferFuncPtr.create(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.BINDBUFFERFUNCPTR)); }
    /** Unsafe version of {@link #bindImageFuncPtr}. */
    public static ktxVulkanTexture_subAllocatorBindImageFuncPtr nbindImageFuncPtr(long struct) { return ktxVulkanTexture_subAllocatorBindImageFuncPtr.create(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.BINDIMAGEFUNCPTR)); }
    /** Unsafe version of {@link #memoryMapFuncPtr}. */
    public static ktxVulkanTexture_subAllocatorMemoryMapFuncPtr nmemoryMapFuncPtr(long struct) { return ktxVulkanTexture_subAllocatorMemoryMapFuncPtr.create(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.MEMORYMAPFUNCPTR)); }
    /** Unsafe version of {@link #memoryUnmapFuncPtr}. */
    public static ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr nmemoryUnmapFuncPtr(long struct) { return ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr.create(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.MEMORYUNMAPFUNCPTR)); }
    /** Unsafe version of {@link #freeMemFuncPtr}. */
    public static ktxVulkanTexture_subAllocatorFreeMemFuncPtr nfreeMemFuncPtr(long struct) { return ktxVulkanTexture_subAllocatorFreeMemFuncPtr.create(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.FREEMEMFUNCPTR)); }

    /** Unsafe version of {@link #allocMemFuncPtr(ktxVulkanTexture_subAllocatorAllocMemFuncPtrI) allocMemFuncPtr}. */
    public static void nallocMemFuncPtr(long struct, ktxVulkanTexture_subAllocatorAllocMemFuncPtrI value) { memPutAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.ALLOCMEMFUNCPTR, value.address()); }
    /** Unsafe version of {@link #bindBufferFuncPtr(ktxVulkanTexture_subAllocatorBindBufferFuncPtrI) bindBufferFuncPtr}. */
    public static void nbindBufferFuncPtr(long struct, ktxVulkanTexture_subAllocatorBindBufferFuncPtrI value) { memPutAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.BINDBUFFERFUNCPTR, value.address()); }
    /** Unsafe version of {@link #bindImageFuncPtr(ktxVulkanTexture_subAllocatorBindImageFuncPtrI) bindImageFuncPtr}. */
    public static void nbindImageFuncPtr(long struct, ktxVulkanTexture_subAllocatorBindImageFuncPtrI value) { memPutAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.BINDIMAGEFUNCPTR, value.address()); }
    /** Unsafe version of {@link #memoryMapFuncPtr(ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI) memoryMapFuncPtr}. */
    public static void nmemoryMapFuncPtr(long struct, ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI value) { memPutAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.MEMORYMAPFUNCPTR, value.address()); }
    /** Unsafe version of {@link #memoryUnmapFuncPtr(ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI) memoryUnmapFuncPtr}. */
    public static void nmemoryUnmapFuncPtr(long struct, ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI value) { memPutAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.MEMORYUNMAPFUNCPTR, value.address()); }
    /** Unsafe version of {@link #freeMemFuncPtr(ktxVulkanTexture_subAllocatorFreeMemFuncPtrI) freeMemFuncPtr}. */
    public static void nfreeMemFuncPtr(long struct, ktxVulkanTexture_subAllocatorFreeMemFuncPtrI value) { memPutAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.FREEMEMFUNCPTR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.ALLOCMEMFUNCPTR));
        check(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.BINDBUFFERFUNCPTR));
        check(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.BINDIMAGEFUNCPTR));
        check(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.MEMORYMAPFUNCPTR));
        check(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.MEMORYUNMAPFUNCPTR));
        check(memGetAddress(struct + ktxVulkanTexture_subAllocatorCallbacks.FREEMEMFUNCPTR));
    }

    // -----------------------------------

    /** An array of {@link ktxVulkanTexture_subAllocatorCallbacks} structs. */
    public static class Buffer extends StructBuffer<ktxVulkanTexture_subAllocatorCallbacks, Buffer> implements NativeResource {

        private static final ktxVulkanTexture_subAllocatorCallbacks ELEMENT_FACTORY = ktxVulkanTexture_subAllocatorCallbacks.create(-1L);

        /**
         * Creates a new {@code ktxVulkanTexture_subAllocatorCallbacks.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxVulkanTexture_subAllocatorCallbacks#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxVulkanTexture_subAllocatorCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code allocMemFuncPtr} field. */
        @NativeType("void * (*) (VkMemoryAllocateInfo *, VkMemoryRequirements *, uint64_t *)")
        public ktxVulkanTexture_subAllocatorAllocMemFuncPtr allocMemFuncPtr() { return ktxVulkanTexture_subAllocatorCallbacks.nallocMemFuncPtr(address()); }
        /** @return the value of the {@code bindBufferFuncPtr} field. */
        @NativeType("void * (*) (VkBuffer, uint64_t)")
        public ktxVulkanTexture_subAllocatorBindBufferFuncPtr bindBufferFuncPtr() { return ktxVulkanTexture_subAllocatorCallbacks.nbindBufferFuncPtr(address()); }
        /** @return the value of the {@code bindImageFuncPtr} field. */
        @NativeType("void * (*) (VkImage, uint64_t)")
        public ktxVulkanTexture_subAllocatorBindImageFuncPtr bindImageFuncPtr() { return ktxVulkanTexture_subAllocatorCallbacks.nbindImageFuncPtr(address()); }
        /** @return the value of the {@code memoryMapFuncPtr} field. */
        @NativeType("void * (*) (uint64_t, uint64_t, VkDeviceSize *, void **)")
        public ktxVulkanTexture_subAllocatorMemoryMapFuncPtr memoryMapFuncPtr() { return ktxVulkanTexture_subAllocatorCallbacks.nmemoryMapFuncPtr(address()); }
        /** @return the value of the {@code memoryUnmapFuncPtr} field. */
        @NativeType("void * (*) (uint64_t, uint64_t)")
        public ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtr memoryUnmapFuncPtr() { return ktxVulkanTexture_subAllocatorCallbacks.nmemoryUnmapFuncPtr(address()); }
        /** @return the value of the {@code freeMemFuncPtr} field. */
        @NativeType("void * (*) (uint64_t)")
        public ktxVulkanTexture_subAllocatorFreeMemFuncPtr freeMemFuncPtr() { return ktxVulkanTexture_subAllocatorCallbacks.nfreeMemFuncPtr(address()); }

        /** Sets the specified value to the {@code allocMemFuncPtr} field. */
        public ktxVulkanTexture_subAllocatorCallbacks.Buffer allocMemFuncPtr(@NativeType("void * (*) (VkMemoryAllocateInfo *, VkMemoryRequirements *, uint64_t *)") ktxVulkanTexture_subAllocatorAllocMemFuncPtrI value) { ktxVulkanTexture_subAllocatorCallbacks.nallocMemFuncPtr(address(), value); return this; }
        /** Sets the specified value to the {@code bindBufferFuncPtr} field. */
        public ktxVulkanTexture_subAllocatorCallbacks.Buffer bindBufferFuncPtr(@NativeType("void * (*) (VkBuffer, uint64_t)") ktxVulkanTexture_subAllocatorBindBufferFuncPtrI value) { ktxVulkanTexture_subAllocatorCallbacks.nbindBufferFuncPtr(address(), value); return this; }
        /** Sets the specified value to the {@code bindImageFuncPtr} field. */
        public ktxVulkanTexture_subAllocatorCallbacks.Buffer bindImageFuncPtr(@NativeType("void * (*) (VkImage, uint64_t)") ktxVulkanTexture_subAllocatorBindImageFuncPtrI value) { ktxVulkanTexture_subAllocatorCallbacks.nbindImageFuncPtr(address(), value); return this; }
        /** Sets the specified value to the {@code memoryMapFuncPtr} field. */
        public ktxVulkanTexture_subAllocatorCallbacks.Buffer memoryMapFuncPtr(@NativeType("void * (*) (uint64_t, uint64_t, VkDeviceSize *, void **)") ktxVulkanTexture_subAllocatorMemoryMapFuncPtrI value) { ktxVulkanTexture_subAllocatorCallbacks.nmemoryMapFuncPtr(address(), value); return this; }
        /** Sets the specified value to the {@code memoryUnmapFuncPtr} field. */
        public ktxVulkanTexture_subAllocatorCallbacks.Buffer memoryUnmapFuncPtr(@NativeType("void * (*) (uint64_t, uint64_t)") ktxVulkanTexture_subAllocatorMemoryUnmapFuncPtrI value) { ktxVulkanTexture_subAllocatorCallbacks.nmemoryUnmapFuncPtr(address(), value); return this; }
        /** Sets the specified value to the {@code freeMemFuncPtr} field. */
        public ktxVulkanTexture_subAllocatorCallbacks.Buffer freeMemFuncPtr(@NativeType("void * (*) (uint64_t)") ktxVulkanTexture_subAllocatorFreeMemFuncPtrI value) { ktxVulkanTexture_subAllocatorCallbacks.nfreeMemFuncPtr(address(), value); return this; }

    }

}