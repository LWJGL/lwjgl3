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
 * Structure specifying video session required memory heap type.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pMemoryRequirements} <b>must</b> be a valid pointer to a {@link VkMemoryRequirements2} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMemoryRequirements2}, {@link KHRVideoQueue#vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoGetMemoryPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #memoryBindIndex};
 *     {@link VkMemoryRequirements2 VkMemoryRequirements2} * {@link #pMemoryRequirements};
 * }</code></pre>
 */
public class VkVideoGetMemoryPropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYBINDINDEX,
        PMEMORYREQUIREMENTS;

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
        MEMORYBINDINDEX = layout.offsetof(2);
        PMEMORYREQUIREMENTS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkVideoGetMemoryPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoGetMemoryPropertiesKHR(ByteBuffer container) {
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
    /** the memory bind index of the memory heap type described by the information returned in {@code pMemoryRequirements}. */
    @NativeType("uint32_t")
    public int memoryBindIndex() { return nmemoryBindIndex(address()); }
    /** a pointer to a {@link VkMemoryRequirements2} structure in which the requested memory heap requirements for the heap with index {@code memoryBindIndex} are returned. */
    @NativeType("VkMemoryRequirements2 *")
    public VkMemoryRequirements2 pMemoryRequirements() { return npMemoryRequirements(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoGetMemoryPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkVideoGetMemoryPropertiesKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoGetMemoryPropertiesKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryBindIndex} field. */
    public VkVideoGetMemoryPropertiesKHR memoryBindIndex(@NativeType("uint32_t") int value) { nmemoryBindIndex(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryRequirements2} to the {@link #pMemoryRequirements} field. */
    public VkVideoGetMemoryPropertiesKHR pMemoryRequirements(@NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 value) { npMemoryRequirements(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoGetMemoryPropertiesKHR set(
        int sType,
        long pNext,
        int memoryBindIndex,
        VkMemoryRequirements2 pMemoryRequirements
    ) {
        sType(sType);
        pNext(pNext);
        memoryBindIndex(memoryBindIndex);
        pMemoryRequirements(pMemoryRequirements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoGetMemoryPropertiesKHR set(VkVideoGetMemoryPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoGetMemoryPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoGetMemoryPropertiesKHR malloc() {
        return wrap(VkVideoGetMemoryPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoGetMemoryPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoGetMemoryPropertiesKHR calloc() {
        return wrap(VkVideoGetMemoryPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoGetMemoryPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoGetMemoryPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoGetMemoryPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoGetMemoryPropertiesKHR} instance for the specified memory address. */
    public static VkVideoGetMemoryPropertiesKHR create(long address) {
        return wrap(VkVideoGetMemoryPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoGetMemoryPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoGetMemoryPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoGetMemoryPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoGetMemoryPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoGetMemoryPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoGetMemoryPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoGetMemoryPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoGetMemoryPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoGetMemoryPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoGetMemoryPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoGetMemoryPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoGetMemoryPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoGetMemoryPropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkVideoGetMemoryPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoGetMemoryPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoGetMemoryPropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkVideoGetMemoryPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoGetMemoryPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoGetMemoryPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoGetMemoryPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoGetMemoryPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoGetMemoryPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoGetMemoryPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #memoryBindIndex}. */
    public static int nmemoryBindIndex(long struct) { return UNSAFE.getInt(null, struct + VkVideoGetMemoryPropertiesKHR.MEMORYBINDINDEX); }
    /** Unsafe version of {@link #pMemoryRequirements}. */
    public static VkMemoryRequirements2 npMemoryRequirements(long struct) { return VkMemoryRequirements2.create(memGetAddress(struct + VkVideoGetMemoryPropertiesKHR.PMEMORYREQUIREMENTS)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoGetMemoryPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoGetMemoryPropertiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #memoryBindIndex(int) memoryBindIndex}. */
    public static void nmemoryBindIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoGetMemoryPropertiesKHR.MEMORYBINDINDEX, value); }
    /** Unsafe version of {@link #pMemoryRequirements(VkMemoryRequirements2) pMemoryRequirements}. */
    public static void npMemoryRequirements(long struct, VkMemoryRequirements2 value) { memPutAddress(struct + VkVideoGetMemoryPropertiesKHR.PMEMORYREQUIREMENTS, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkVideoGetMemoryPropertiesKHR.PMEMORYREQUIREMENTS));
    }

    // -----------------------------------

    /** An array of {@link VkVideoGetMemoryPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoGetMemoryPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoGetMemoryPropertiesKHR ELEMENT_FACTORY = VkVideoGetMemoryPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoGetMemoryPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoGetMemoryPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoGetMemoryPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoGetMemoryPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoGetMemoryPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoGetMemoryPropertiesKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoGetMemoryPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoGetMemoryPropertiesKHR#memoryBindIndex} field. */
        @NativeType("uint32_t")
        public int memoryBindIndex() { return VkVideoGetMemoryPropertiesKHR.nmemoryBindIndex(address()); }
        /** @return a {@link VkMemoryRequirements2} view of the struct pointed to by the {@link VkVideoGetMemoryPropertiesKHR#pMemoryRequirements} field. */
        @NativeType("VkMemoryRequirements2 *")
        public VkMemoryRequirements2 pMemoryRequirements() { return VkVideoGetMemoryPropertiesKHR.npMemoryRequirements(address()); }

        /** Sets the specified value to the {@link VkVideoGetMemoryPropertiesKHR#sType} field. */
        public VkVideoGetMemoryPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoGetMemoryPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR} value to the {@link VkVideoGetMemoryPropertiesKHR#sType} field. */
        public VkVideoGetMemoryPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_GET_MEMORY_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkVideoGetMemoryPropertiesKHR#pNext} field. */
        public VkVideoGetMemoryPropertiesKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoGetMemoryPropertiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoGetMemoryPropertiesKHR#memoryBindIndex} field. */
        public VkVideoGetMemoryPropertiesKHR.Buffer memoryBindIndex(@NativeType("uint32_t") int value) { VkVideoGetMemoryPropertiesKHR.nmemoryBindIndex(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryRequirements2} to the {@link VkVideoGetMemoryPropertiesKHR#pMemoryRequirements} field. */
        public VkVideoGetMemoryPropertiesKHR.Buffer pMemoryRequirements(@NativeType("VkMemoryRequirements2 *") VkMemoryRequirements2 value) { VkVideoGetMemoryPropertiesKHR.npMemoryRequirements(address(), value); return this; }

    }

}