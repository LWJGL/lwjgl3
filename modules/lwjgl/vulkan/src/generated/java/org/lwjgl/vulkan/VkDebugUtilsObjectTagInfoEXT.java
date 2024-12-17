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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDebugUtilsObjectTagInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkObjectType objectType;
 *     uint64_t objectHandle;
 *     uint64_t tagName;
 *     size_t tagSize;
 *     void const * pTag;
 * }}</pre>
 */
public class VkDebugUtilsObjectTagInfoEXT extends Struct<VkDebugUtilsObjectTagInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTTYPE,
        OBJECTHANDLE,
        TAGNAME,
        TAGSIZE,
        PTAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECTHANDLE = layout.offsetof(3);
        TAGNAME = layout.offsetof(4);
        TAGSIZE = layout.offsetof(5);
        PTAG = layout.offsetof(6);
    }

    protected VkDebugUtilsObjectTagInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDebugUtilsObjectTagInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDebugUtilsObjectTagInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDebugUtilsObjectTagInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsObjectTagInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code objectType} field. */
    @NativeType("VkObjectType")
    public int objectType() { return nobjectType(address()); }
    /** @return the value of the {@code objectHandle} field. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** @return the value of the {@code tagName} field. */
    @NativeType("uint64_t")
    public long tagName() { return ntagName(address()); }
    /** @return the value of the {@code tagSize} field. */
    @NativeType("size_t")
    public long tagSize() { return ntagSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
    @NativeType("void const *")
    public ByteBuffer pTag() { return npTag(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDebugUtilsObjectTagInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT} value to the {@code sType} field. */
    public VkDebugUtilsObjectTagInfoEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDebugUtilsObjectTagInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code objectType} field. */
    public VkDebugUtilsObjectTagInfoEXT objectType(@NativeType("VkObjectType") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@code objectHandle} field. */
    public VkDebugUtilsObjectTagInfoEXT objectHandle(@NativeType("uint64_t") long value) { nobjectHandle(address(), value); return this; }
    /** Sets the specified value to the {@code tagName} field. */
    public VkDebugUtilsObjectTagInfoEXT tagName(@NativeType("uint64_t") long value) { ntagName(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
    public VkDebugUtilsObjectTagInfoEXT pTag(@NativeType("void const *") ByteBuffer value) { npTag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsObjectTagInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long objectHandle,
        long tagName,
        ByteBuffer pTag
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        objectHandle(objectHandle);
        tagName(tagName);
        pTag(pTag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugUtilsObjectTagInfoEXT set(VkDebugUtilsObjectTagInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectTagInfoEXT malloc() {
        return new VkDebugUtilsObjectTagInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectTagInfoEXT calloc() {
        return new VkDebugUtilsObjectTagInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsObjectTagInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsObjectTagInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance for the specified memory address. */
    public static VkDebugUtilsObjectTagInfoEXT create(long address) {
        return new VkDebugUtilsObjectTagInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDebugUtilsObjectTagInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDebugUtilsObjectTagInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDebugUtilsObjectTagInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectTagInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectTagInfoEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsObjectTagInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectTagInfoEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsObjectTagInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDebugUtilsObjectTagInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return memGetInt(struct + VkDebugUtilsObjectTagInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return memGetLong(struct + VkDebugUtilsObjectTagInfoEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #tagName}. */
    public static long ntagName(long struct) { return memGetLong(struct + VkDebugUtilsObjectTagInfoEXT.TAGNAME); }
    /** Unsafe version of {@link #tagSize}. */
    public static long ntagSize(long struct) { return memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.TAGSIZE); }
    /** Unsafe version of {@link #pTag() pTag}. */
    public static ByteBuffer npTag(long struct) { return memByteBuffer(memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.PTAG), (int)ntagSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDebugUtilsObjectTagInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsObjectTagInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { memPutInt(struct + VkDebugUtilsObjectTagInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #objectHandle(long) objectHandle}. */
    public static void nobjectHandle(long struct, long value) { memPutLong(struct + VkDebugUtilsObjectTagInfoEXT.OBJECTHANDLE, value); }
    /** Unsafe version of {@link #tagName(long) tagName}. */
    public static void ntagName(long struct, long value) { memPutLong(struct + VkDebugUtilsObjectTagInfoEXT.TAGNAME, value); }
    /** Sets the specified value to the {@code tagSize} field of the specified {@code struct}. */
    public static void ntagSize(long struct, long value) { memPutAddress(struct + VkDebugUtilsObjectTagInfoEXT.TAGSIZE, value); }
    /** Unsafe version of {@link #pTag(ByteBuffer) pTag}. */
    public static void npTag(long struct, ByteBuffer value) { memPutAddress(struct + VkDebugUtilsObjectTagInfoEXT.PTAG, memAddress(value)); ntagSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.PTAG));
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsObjectTagInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsObjectTagInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsObjectTagInfoEXT ELEMENT_FACTORY = VkDebugUtilsObjectTagInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsObjectTagInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsObjectTagInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDebugUtilsObjectTagInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsObjectTagInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsObjectTagInfoEXT.npNext(address()); }
        /** @return the value of the {@code objectType} field. */
        @NativeType("VkObjectType")
        public int objectType() { return VkDebugUtilsObjectTagInfoEXT.nobjectType(address()); }
        /** @return the value of the {@code objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return VkDebugUtilsObjectTagInfoEXT.nobjectHandle(address()); }
        /** @return the value of the {@code tagName} field. */
        @NativeType("uint64_t")
        public long tagName() { return VkDebugUtilsObjectTagInfoEXT.ntagName(address()); }
        /** @return the value of the {@code tagSize} field. */
        @NativeType("size_t")
        public long tagSize() { return VkDebugUtilsObjectTagInfoEXT.ntagSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
        @NativeType("void const *")
        public ByteBuffer pTag() { return VkDebugUtilsObjectTagInfoEXT.npTag(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsObjectTagInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT} value to the {@code sType} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsObjectTagInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code objectType} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer objectType(@NativeType("VkObjectType") int value) { VkDebugUtilsObjectTagInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@code objectHandle} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer objectHandle(@NativeType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.nobjectHandle(address(), value); return this; }
        /** Sets the specified value to the {@code tagName} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer tagName(@NativeType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.ntagName(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer pTag(@NativeType("void const *") ByteBuffer value) { VkDebugUtilsObjectTagInfoEXT.npTag(address(), value); return this; }

    }

}