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
 * Specify parameters of a name to give to an object.
 * 
 * <h5>Description</h5>
 * 
 * <p>Applications <b>may</b> change the name associated with an object simply by calling {@code vkDebugMarkerSetObjectNameEXT} again with a new string. To remove a previously set name, {@code pObjectName} <b>should</b> be set to an empty string.</p>
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
 * <li>{@code sType} <b>must</b> be {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code VkDebugReportObjectTypeEXT} value</li>
 * <li>{@code pObjectName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTDebugMarker#vkDebugMarkerSetObjectNameEXT DebugMarkerSetObjectNameEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugMarkerObjectNameInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDebugReportObjectTypeEXT {@link #objectType};
 *     uint64_t {@link #object};
 *     char const * {@link #pObjectName};
 * }</code></pre>
 */
public class VkDebugMarkerObjectNameInfoEXT extends Struct implements NativeResource {

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
        POBJECTNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECT = layout.offsetof(3);
        POBJECTNAME = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDebugMarkerObjectNameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugMarkerObjectNameInfoEXT(ByteBuffer container) {
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
    /** the object to be named. */
    @NativeType("uint64_t")
    public long object() { return nobject(address()); }
    /** a null-terminated UTF-8 string specifying the name to apply to {@code object}. */
    @NativeType("char const *")
    public ByteBuffer pObjectName() { return npObjectName(address()); }
    /** a null-terminated UTF-8 string specifying the name to apply to {@code object}. */
    @NativeType("char const *")
    public String pObjectNameString() { return npObjectNameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugMarkerObjectNameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT} value to the {@link #sType} field. */
    public VkDebugMarkerObjectNameInfoEXT sType$Default() { return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugMarkerObjectNameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #objectType} field. */
    public VkDebugMarkerObjectNameInfoEXT objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@link #object} field. */
    public VkDebugMarkerObjectNameInfoEXT object(@NativeType("uint64_t") long value) { nobject(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pObjectName} field. */
    public VkDebugMarkerObjectNameInfoEXT pObjectName(@NativeType("char const *") ByteBuffer value) { npObjectName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugMarkerObjectNameInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long object,
        ByteBuffer pObjectName
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        object(object);
        pObjectName(pObjectName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDebugMarkerObjectNameInfoEXT set(VkDebugMarkerObjectNameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugMarkerObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectNameInfoEXT malloc() {
        return wrap(VkDebugMarkerObjectNameInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugMarkerObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugMarkerObjectNameInfoEXT calloc() {
        return wrap(VkDebugMarkerObjectNameInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugMarkerObjectNameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugMarkerObjectNameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugMarkerObjectNameInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugMarkerObjectNameInfoEXT} instance for the specified memory address. */
    public static VkDebugMarkerObjectNameInfoEXT create(long address) {
        return wrap(VkDebugMarkerObjectNameInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugMarkerObjectNameInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugMarkerObjectNameInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectNameInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectNameInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectNameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectNameInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugMarkerObjectNameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugMarkerObjectNameInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugMarkerObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectNameInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDebugMarkerObjectNameInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugMarkerObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugMarkerObjectNameInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDebugMarkerObjectNameInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectNameInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugMarkerObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugMarkerObjectNameInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugMarkerObjectNameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + VkDebugMarkerObjectNameInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #object}. */
    public static long nobject(long struct) { return UNSAFE.getLong(null, struct + VkDebugMarkerObjectNameInfoEXT.OBJECT); }
    /** Unsafe version of {@link #pObjectName}. */
    public static ByteBuffer npObjectName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME)); }
    /** Unsafe version of {@link #pObjectNameString}. */
    public static String npObjectNameString(long struct) { return memUTF8(memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugMarkerObjectNameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugMarkerObjectNameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugMarkerObjectNameInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #object(long) object}. */
    public static void nobject(long struct, long value) { UNSAFE.putLong(null, struct + VkDebugMarkerObjectNameInfoEXT.OBJECT, value); }
    /** Unsafe version of {@link #pObjectName(ByteBuffer) pObjectName}. */
    public static void npObjectName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugMarkerObjectNameInfoEXT.POBJECTNAME));
    }

    // -----------------------------------

    /** An array of {@link VkDebugMarkerObjectNameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugMarkerObjectNameInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugMarkerObjectNameInfoEXT ELEMENT_FACTORY = VkDebugMarkerObjectNameInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugMarkerObjectNameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugMarkerObjectNameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugMarkerObjectNameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugMarkerObjectNameInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugMarkerObjectNameInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectNameInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugMarkerObjectNameInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectNameInfoEXT#objectType} field. */
        @NativeType("VkDebugReportObjectTypeEXT")
        public int objectType() { return VkDebugMarkerObjectNameInfoEXT.nobjectType(address()); }
        /** @return the value of the {@link VkDebugMarkerObjectNameInfoEXT#object} field. */
        @NativeType("uint64_t")
        public long object() { return VkDebugMarkerObjectNameInfoEXT.nobject(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkDebugMarkerObjectNameInfoEXT#pObjectName} field. */
        @NativeType("char const *")
        public ByteBuffer pObjectName() { return VkDebugMarkerObjectNameInfoEXT.npObjectName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkDebugMarkerObjectNameInfoEXT#pObjectName} field. */
        @NativeType("char const *")
        public String pObjectNameString() { return VkDebugMarkerObjectNameInfoEXT.npObjectNameString(address()); }

        /** Sets the specified value to the {@link VkDebugMarkerObjectNameInfoEXT#sType} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugMarkerObjectNameInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugMarker#VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT} value to the {@link VkDebugMarkerObjectNameInfoEXT#sType} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer sType$Default() { return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT); }
        /** Sets the specified value to the {@link VkDebugMarkerObjectNameInfoEXT#pNext} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugMarkerObjectNameInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugMarkerObjectNameInfoEXT#objectType} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) { VkDebugMarkerObjectNameInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugMarkerObjectNameInfoEXT#object} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer object(@NativeType("uint64_t") long value) { VkDebugMarkerObjectNameInfoEXT.nobject(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkDebugMarkerObjectNameInfoEXT#pObjectName} field. */
        public VkDebugMarkerObjectNameInfoEXT.Buffer pObjectName(@NativeType("char const *") ByteBuffer value) { VkDebugMarkerObjectNameInfoEXT.npObjectName(address(), value); return this; }

    }

}