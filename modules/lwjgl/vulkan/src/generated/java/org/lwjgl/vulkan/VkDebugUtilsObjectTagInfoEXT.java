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
 * Specify parameters of a tag to attach to an object.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for only data that can be used by that implementation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code objectType} <b>must</b> not be {@link VK10#VK_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}</li>
 * <li>{@code objectHandle} <b>must</b> be a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-object-types">{@code VkObjectType} and Vulkan Handle Relationship</a> table</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
 * <li>{@code pTag} <b>must</b> be a valid pointer to an array of {@code tagSize} bytes</li>
 * <li>{@code tagSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDebugUtils#vkSetDebugUtilsObjectTagEXT SetDebugUtilsObjectTagEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsObjectTagInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkObjectType {@link #objectType};
 *     uint64_t {@link #objectHandle};
 *     uint64_t {@link #tagName};
 *     size_t {@link #tagSize};
 *     void const * {@link #pTag};
 * }</code></pre>
 */
public class VkDebugUtilsObjectTagInfoEXT extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkObjectType} specifying the type of the object to be named. */
    @NativeType("VkObjectType")
    public int objectType() { return nobjectType(address()); }
    /** the object to be tagged. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** a numerical identifier of the tag. */
    @NativeType("uint64_t")
    public long tagName() { return ntagName(address()); }
    /** the number of bytes of data to attach to the object. */
    @NativeType("size_t")
    public long tagSize() { return ntagSize(address()); }
    /** a pointer to an array of {@code tagSize} bytes containing the data to be associated with the object. */
    @NativeType("void const *")
    public ByteBuffer pTag() { return npTag(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugUtilsObjectTagInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT} value to the {@link #sType} field. */
    public VkDebugUtilsObjectTagInfoEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugUtilsObjectTagInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #objectType} field. */
    public VkDebugUtilsObjectTagInfoEXT objectType(@NativeType("VkObjectType") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@link #objectHandle} field. */
    public VkDebugUtilsObjectTagInfoEXT objectHandle(@NativeType("uint64_t") long value) { nobjectHandle(address(), value); return this; }
    /** Sets the specified value to the {@link #tagName} field. */
    public VkDebugUtilsObjectTagInfoEXT tagName(@NativeType("uint64_t") long value) { ntagName(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pTag} field. */
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
        return wrap(VkDebugUtilsObjectTagInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectTagInfoEXT calloc() {
        return wrap(VkDebugUtilsObjectTagInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsObjectTagInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugUtilsObjectTagInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance for the specified memory address. */
    public static VkDebugUtilsObjectTagInfoEXT create(long address) {
        return wrap(VkDebugUtilsObjectTagInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsObjectTagInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugUtilsObjectTagInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsObjectTagInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkDebugUtilsObjectTagInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectTagInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDebugUtilsObjectTagInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectTagInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsObjectTagInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsObjectTagInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return UNSAFE.getLong(null, struct + VkDebugUtilsObjectTagInfoEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #tagName}. */
    public static long ntagName(long struct) { return UNSAFE.getLong(null, struct + VkDebugUtilsObjectTagInfoEXT.TAGNAME); }
    /** Unsafe version of {@link #tagSize}. */
    public static long ntagSize(long struct) { return memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.TAGSIZE); }
    /** Unsafe version of {@link #pTag() pTag}. */
    public static ByteBuffer npTag(long struct) { return memByteBuffer(memGetAddress(struct + VkDebugUtilsObjectTagInfoEXT.PTAG), (int)ntagSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsObjectTagInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsObjectTagInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsObjectTagInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #objectHandle(long) objectHandle}. */
    public static void nobjectHandle(long struct, long value) { UNSAFE.putLong(null, struct + VkDebugUtilsObjectTagInfoEXT.OBJECTHANDLE, value); }
    /** Unsafe version of {@link #tagName(long) tagName}. */
    public static void ntagName(long struct, long value) { UNSAFE.putLong(null, struct + VkDebugUtilsObjectTagInfoEXT.TAGNAME, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsObjectTagInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsObjectTagInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugUtilsObjectTagInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsObjectTagInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectTagInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsObjectTagInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectTagInfoEXT#objectType} field. */
        @NativeType("VkObjectType")
        public int objectType() { return VkDebugUtilsObjectTagInfoEXT.nobjectType(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectTagInfoEXT#objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return VkDebugUtilsObjectTagInfoEXT.nobjectHandle(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectTagInfoEXT#tagName} field. */
        @NativeType("uint64_t")
        public long tagName() { return VkDebugUtilsObjectTagInfoEXT.ntagName(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectTagInfoEXT#tagSize} field. */
        @NativeType("size_t")
        public long tagSize() { return VkDebugUtilsObjectTagInfoEXT.ntagSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkDebugUtilsObjectTagInfoEXT#pTag} field. */
        @NativeType("void const *")
        public ByteBuffer pTag() { return VkDebugUtilsObjectTagInfoEXT.npTag(address()); }

        /** Sets the specified value to the {@link VkDebugUtilsObjectTagInfoEXT#sType} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsObjectTagInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT} value to the {@link VkDebugUtilsObjectTagInfoEXT#sType} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT); }
        /** Sets the specified value to the {@link VkDebugUtilsObjectTagInfoEXT#pNext} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsObjectTagInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsObjectTagInfoEXT#objectType} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer objectType(@NativeType("VkObjectType") int value) { VkDebugUtilsObjectTagInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsObjectTagInfoEXT#objectHandle} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer objectHandle(@NativeType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.nobjectHandle(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsObjectTagInfoEXT#tagName} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer tagName(@NativeType("uint64_t") long value) { VkDebugUtilsObjectTagInfoEXT.ntagName(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkDebugUtilsObjectTagInfoEXT#pTag} field. */
        public VkDebugUtilsObjectTagInfoEXT.Buffer pTag(@NativeType("void const *") ByteBuffer value) { VkDebugUtilsObjectTagInfoEXT.npTag(address(), value); return this; }

    }

}