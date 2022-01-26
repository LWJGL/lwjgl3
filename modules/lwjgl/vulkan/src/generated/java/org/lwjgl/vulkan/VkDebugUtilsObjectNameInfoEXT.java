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
 * <p>Applications <b>may</b> change the name associated with an object simply by calling {@code vkSetDebugUtilsObjectNameEXT} again with a new string. If {@code pObjectName} is either {@code NULL} or an empty string, then any previously set name is removed.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code objectType} is {@link VK10#VK_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}, {@code objectHandle} <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code objectType} is not {@link VK10#VK_OBJECT_TYPE_UNKNOWN OBJECT_TYPE_UNKNOWN}, {@code objectHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-object-types">{@code VkObjectType} and Vulkan Handle Relationship</a> table</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
 * <li>If {@code pObjectName} is not {@code NULL}, {@code pObjectName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCallbackDataEXT}, {@link EXTDebugUtils#vkSetDebugUtilsObjectNameEXT SetDebugUtilsObjectNameEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugUtilsObjectNameInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkObjectType {@link #objectType};
 *     uint64_t {@link #objectHandle};
 *     char const * {@link #pObjectName};
 * }</code></pre>
 */
public class VkDebugUtilsObjectNameInfoEXT extends Struct implements NativeResource {

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
        OBJECTHANDLE = layout.offsetof(3);
        POBJECTNAME = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDebugUtilsObjectNameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugUtilsObjectNameInfoEXT(ByteBuffer container) {
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
    /** the object to be named. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** either {@code NULL} or a null-terminated UTF-8 string specifying the name to apply to {@code objectHandle}. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pObjectName() { return npObjectName(address()); }
    /** either {@code NULL} or a null-terminated UTF-8 string specifying the name to apply to {@code objectHandle}. */
    @Nullable
    @NativeType("char const *")
    public String pObjectNameString() { return npObjectNameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugUtilsObjectNameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT} value to the {@link #sType} field. */
    public VkDebugUtilsObjectNameInfoEXT sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugUtilsObjectNameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #objectType} field. */
    public VkDebugUtilsObjectNameInfoEXT objectType(@NativeType("VkObjectType") int value) { nobjectType(address(), value); return this; }
    /** Sets the specified value to the {@link #objectHandle} field. */
    public VkDebugUtilsObjectNameInfoEXT objectHandle(@NativeType("uint64_t") long value) { nobjectHandle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pObjectName} field. */
    public VkDebugUtilsObjectNameInfoEXT pObjectName(@Nullable @NativeType("char const *") ByteBuffer value) { npObjectName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugUtilsObjectNameInfoEXT set(
        int sType,
        long pNext,
        int objectType,
        long objectHandle,
        @Nullable ByteBuffer pObjectName
    ) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        objectHandle(objectHandle);
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
    public VkDebugUtilsObjectNameInfoEXT set(VkDebugUtilsObjectNameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugUtilsObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectNameInfoEXT malloc() {
        return wrap(VkDebugUtilsObjectNameInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsObjectNameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugUtilsObjectNameInfoEXT calloc() {
        return wrap(VkDebugUtilsObjectNameInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugUtilsObjectNameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugUtilsObjectNameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugUtilsObjectNameInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugUtilsObjectNameInfoEXT} instance for the specified memory address. */
    public static VkDebugUtilsObjectNameInfoEXT create(long address) {
        return wrap(VkDebugUtilsObjectNameInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsObjectNameInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugUtilsObjectNameInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugUtilsObjectNameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugUtilsObjectNameInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugUtilsObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectNameInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDebugUtilsObjectNameInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugUtilsObjectNameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugUtilsObjectNameInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDebugUtilsObjectNameInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugUtilsObjectNameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugUtilsObjectNameInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsObjectNameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugUtilsObjectNameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + VkDebugUtilsObjectNameInfoEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return UNSAFE.getLong(null, struct + VkDebugUtilsObjectNameInfoEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #pObjectName}. */
    @Nullable public static ByteBuffer npObjectName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkDebugUtilsObjectNameInfoEXT.POBJECTNAME)); }
    /** Unsafe version of {@link #pObjectNameString}. */
    @Nullable public static String npObjectNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkDebugUtilsObjectNameInfoEXT.POBJECTNAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsObjectNameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugUtilsObjectNameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #objectType(int) objectType}. */
    public static void nobjectType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugUtilsObjectNameInfoEXT.OBJECTTYPE, value); }
    /** Unsafe version of {@link #objectHandle(long) objectHandle}. */
    public static void nobjectHandle(long struct, long value) { UNSAFE.putLong(null, struct + VkDebugUtilsObjectNameInfoEXT.OBJECTHANDLE, value); }
    /** Unsafe version of {@link #pObjectName(ByteBuffer) pObjectName}. */
    public static void npObjectName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkDebugUtilsObjectNameInfoEXT.POBJECTNAME, memAddressSafe(value));
    }

    // -----------------------------------

    /** An array of {@link VkDebugUtilsObjectNameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugUtilsObjectNameInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugUtilsObjectNameInfoEXT ELEMENT_FACTORY = VkDebugUtilsObjectNameInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugUtilsObjectNameInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugUtilsObjectNameInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugUtilsObjectNameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugUtilsObjectNameInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugUtilsObjectNameInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectNameInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugUtilsObjectNameInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectNameInfoEXT#objectType} field. */
        @NativeType("VkObjectType")
        public int objectType() { return VkDebugUtilsObjectNameInfoEXT.nobjectType(address()); }
        /** @return the value of the {@link VkDebugUtilsObjectNameInfoEXT#objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return VkDebugUtilsObjectNameInfoEXT.nobjectHandle(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkDebugUtilsObjectNameInfoEXT#pObjectName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pObjectName() { return VkDebugUtilsObjectNameInfoEXT.npObjectName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkDebugUtilsObjectNameInfoEXT#pObjectName} field. */
        @Nullable
        @NativeType("char const *")
        public String pObjectNameString() { return VkDebugUtilsObjectNameInfoEXT.npObjectNameString(address()); }

        /** Sets the specified value to the {@link VkDebugUtilsObjectNameInfoEXT#sType} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugUtilsObjectNameInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugUtils#VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT} value to the {@link VkDebugUtilsObjectNameInfoEXT#sType} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer sType$Default() { return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT); }
        /** Sets the specified value to the {@link VkDebugUtilsObjectNameInfoEXT#pNext} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugUtilsObjectNameInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsObjectNameInfoEXT#objectType} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer objectType(@NativeType("VkObjectType") int value) { VkDebugUtilsObjectNameInfoEXT.nobjectType(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugUtilsObjectNameInfoEXT#objectHandle} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer objectHandle(@NativeType("uint64_t") long value) { VkDebugUtilsObjectNameInfoEXT.nobjectHandle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkDebugUtilsObjectNameInfoEXT#pObjectName} field. */
        public VkDebugUtilsObjectNameInfoEXT.Buffer pObjectName(@Nullable @NativeType("char const *") ByteBuffer value) { VkDebugUtilsObjectNameInfoEXT.npObjectName(address(), value); return this; }

    }

}