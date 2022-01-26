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
 * <li>{@code objectType} <b>must</b> not be {@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</li>
 * <li>{@code object} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>{@code object} <b>must</b> be a Vulkan object of the type associated with {@code objectType} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debug-report-object-types">{@code VkDebugReportObjectTypeEXT} and Vulkan Handle Relationship</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
 * <li>{@code pTag} <b>must</b> be a valid pointer to an array of {@code tagSize} bytes</li>
 * <li>{@code tagSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDebugMarker#vkDebugMarkerSetObjectTagEXT DebugMarkerSetObjectTagEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugMarkerObjectTagInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDebugReportObjectTypeEXT {@link #objectType};
 *     uint64_t {@link #object};
 *     uint64_t {@link #tagName};
 *     size_t {@link #tagSize};
 *     void const * {@link #pTag};
 * }</code></pre>
 */
public class VkDebugMarkerObjectTagInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OBJECTTYPE,
        OBJECT,
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
        OBJECT = layout.offsetof(3);
        TAGNAME = layout.offsetof(4);
        TAGSIZE = layout.offsetof(5);
        PTAG = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkDebugMarkerObjectTagInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugMarkerObjectTagInfoEXT(ByteBuffer container) {
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
    /** a {@code VkDebugReportObjectTypeEXT} specifying the type of the object to be named. */
    @NativeType("VkDebugReportObjectTypeEXT")
    public int objectType() { return nobjectType(address()); }
    /** the object to be tagged. */
    @NativeType("uint64_t")
    public long object() { return nobject(address()); }
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
    public VkDebugMarkerObjectTagInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT} value to the {@link #sType} field. */
    public VkDebugMarkerObjectTagInfoEXT sType$Default() { return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugMarkerObjectTagInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #objectType} field. */
    public VkDebugMarkerObjectTagInfoEXT objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@link #object} field. */
    public VkDebugMarkerObjectTagInfoEXT object(@NativeType("uint64_t") long value) { nobject(address(), value); return this; }
    /** Sets the specified value to the {@link #tagName} field. */
    public VkDebugMarkerObjectTagInfoEXT tagName(@NativeType("uint64_t") long value) { ntagName(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pTag} field. */
    public VkDebugMarkerObjectTagInfoEXT pTag(@NativeType("void const *") ByteBuffer value) { npTag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugMarkerObjectTagInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long object,
        long tagName,
        ByteBuffer pTag
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        object(object);
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
    public VkDebugMarkerObjectTagInfoEXT set(VkDebugMarkerObjectTagInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectTagInfoEXT malloc() {
        return wrap(VkDebugMarkerObjectTagInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectTagInfoEXT calloc() {
        return wrap(VkDebugMarkerObjectTagInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugMarkerObjectTagInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugMarkerObjectTagInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance for the specified memory address. */
    public static VkDebugMarkerObjectTagInfoEXT create(long address) {
        return wrap(VkDebugMarkerObjectTagInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugMarkerObjectTagInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugMarkerObjectTagInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugMarkerObjectTagInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectTagInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectTagInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDebugMarkerObjectTagInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugMarkerObjectTagInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectTagInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDebugMarkerObjectTagInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectTagInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectTagInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugMarkerObjectTagInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + VkDebugMarkerObjectTagInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #object}. */
    public static long nobject(long struct) { return UNSAFE.getLong(null, struct + VkDebugMarkerObjectTagInfoEXT.OBJECT); }
    /** Unsafe version of {@link #tagName}. */
    public static long ntagName(long struct) { return UNSAFE.getLong(null, struct + VkDebugMarkerObjectTagInfoEXT.TAGNAME); }
    /** Unsafe version of {@link #tagSize}. */
    public static long ntagSize(long struct) { return memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.TAGSIZE); }
    /** Unsafe version of {@link #pTag() pTag}. */
    public static ByteBuffer npTag(long struct) { return memByteBuffer(memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG), (int)ntagSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugMarkerObjectTagInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugMarkerObjectTagInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #object(long) object}. */
    public static void nobject(long struct, long value) { UNSAFE.putLong(null, struct + VkDebugMarkerObjectTagInfoEXT.OBJECT, value); }
    /** Unsafe version of {@link #tagName(long) tagName}. */
    public static void ntagName(long struct, long value) { UNSAFE.putLong(null, struct + VkDebugMarkerObjectTagInfoEXT.TAGNAME, value); }
    /** Sets the specified value to the {@code tagSize} field of the specified {@code struct}. */
    public static void ntagSize(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.TAGSIZE, value); }
    /** Unsafe version of {@link #pTag(ByteBuffer) pTag}. */
    public static void npTag(long struct, ByteBuffer value) { memPutAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG, memAddress(value)); ntagSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugMarkerObjectTagInfoEXT.PTAG));
    }

    // -----------------------------------

    /** An array of {@link VkDebugMarkerObjectTagInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugMarkerObjectTagInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugMarkerObjectTagInfoEXT ELEMENT_FACTORY = VkDebugMarkerObjectTagInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugMarkerObjectTagInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugMarkerObjectTagInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugMarkerObjectTagInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugMarkerObjectTagInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugMarkerObjectTagInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectTagInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugMarkerObjectTagInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectTagInfoEXT#objectType} field. */
        @NativeType("VkDebugReportObjectTypeEXT")
        public int objectType() { return VkDebugMarkerObjectTagInfoEXT.nobjectType(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectTagInfoEXT#object} field. */
        @NativeType("uint64_t")
        public long object() { return VkDebugMarkerObjectTagInfoEXT.nobject(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectTagInfoEXT#tagName} field. */
        @NativeType("uint64_t")
        public long tagName() { return VkDebugMarkerObjectTagInfoEXT.ntagName(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectTagInfoEXT#tagSize} field. */
        @NativeType("size_t")
        public long tagSize() { return VkDebugMarkerObjectTagInfoEXT.ntagSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkDebugMarkerObjectTagInfoEXT#pTag} field. */
        @NativeType("void const *")
        public ByteBuffer pTag() { return VkDebugMarkerObjectTagInfoEXT.npTag(address()); }

        /** Sets the specified value to the {@link VkDebugMarkerObjectTagInfoEXT#sType} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugMarkerObjectTagInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT} value to the {@link VkDebugMarkerObjectTagInfoEXT#sType} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer sType$Default() { return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT); }
        /** Sets the specified value to the {@link VkDebugMarkerObjectTagInfoEXT#pNext} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugMarkerObjectTagInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugMarkerObjectTagInfoEXT#objectType} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectTagInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugMarkerObjectTagInfoEXT#object} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer object(@NativeType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.nobject(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugMarkerObjectTagInfoEXT#tagName} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer tagName(@NativeType("uint64_t") long value) { VkDebugMarkerObjectTagInfoEXT.ntagName(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkDebugMarkerObjectTagInfoEXT#pTag} field. */
        public VkDebugMarkerObjectTagInfoEXT.Buffer pTag(@NativeType("void const *") ByteBuffer value) { VkDebugMarkerObjectTagInfoEXT.npTag(address(), value); return this; }

    }

}