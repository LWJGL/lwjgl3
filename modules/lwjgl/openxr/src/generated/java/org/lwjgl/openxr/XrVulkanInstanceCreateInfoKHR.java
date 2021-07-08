/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVulkanInstanceCreateInfoKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrSystemId systemId;
 *     XrVulkanInstanceCreateFlagsKHR createFlags;
 *     PFN_vkGetInstanceProcAddr pfnGetInstanceProcAddr;
 *     {@link VkInstanceCreateInfo VkInstanceCreateInfo} const * vulkanCreateInfo;
 *     {@link VkAllocationCallbacks VkAllocationCallbacks} const * vulkanAllocator;
 * }</code></pre>
 */
public class XrVulkanInstanceCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SYSTEMID,
        CREATEFLAGS,
        PFNGETINSTANCEPROCADDR,
        VULKANCREATEINFO,
        VULKANALLOCATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SYSTEMID = layout.offsetof(2);
        CREATEFLAGS = layout.offsetof(3);
        PFNGETINSTANCEPROCADDR = layout.offsetof(4);
        VULKANCREATEINFO = layout.offsetof(5);
        VULKANALLOCATOR = layout.offsetof(6);
    }

    /**
     * Creates a {@code XrVulkanInstanceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVulkanInstanceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code systemId} field. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }
    /** @return the value of the {@code createFlags} field. */
    @NativeType("XrVulkanInstanceCreateFlagsKHR")
    public long createFlags() { return ncreateFlags(address()); }
    /** @return the value of the {@code pfnGetInstanceProcAddr} field. */
    @NativeType("PFN_vkGetInstanceProcAddr")
    public long pfnGetInstanceProcAddr() { return npfnGetInstanceProcAddr(address()); }
    /** @return a {@link VkInstanceCreateInfo} view of the struct pointed to by the {@code vulkanCreateInfo} field. */
    @NativeType("VkInstanceCreateInfo const *")
    public VkInstanceCreateInfo vulkanCreateInfo() { return nvulkanCreateInfo(address()); }
    /** @return a {@link VkAllocationCallbacks} view of the struct pointed to by the {@code vulkanAllocator} field. */
    @Nullable
    @NativeType("VkAllocationCallbacks const *")
    public VkAllocationCallbacks vulkanAllocator() { return nvulkanAllocator(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVulkanInstanceCreateInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrVulkanInstanceCreateInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code systemId} field. */
    public XrVulkanInstanceCreateInfoKHR systemId(@NativeType("XrSystemId") long value) { nsystemId(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrVulkanInstanceCreateInfoKHR createFlags(@NativeType("XrVulkanInstanceCreateFlagsKHR") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code pfnGetInstanceProcAddr} field. */
    public XrVulkanInstanceCreateInfoKHR pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { npfnGetInstanceProcAddr(address(), value); return this; }
    /** Sets the address of the specified {@link VkInstanceCreateInfo} to the {@code vulkanCreateInfo} field. */
    public XrVulkanInstanceCreateInfoKHR vulkanCreateInfo(@NativeType("VkInstanceCreateInfo const *") VkInstanceCreateInfo value) { nvulkanCreateInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@code vulkanAllocator} field. */
    public XrVulkanInstanceCreateInfoKHR vulkanAllocator(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { nvulkanAllocator(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVulkanInstanceCreateInfoKHR set(
        int type,
        long next,
        long systemId,
        long createFlags,
        long pfnGetInstanceProcAddr,
        VkInstanceCreateInfo vulkanCreateInfo,
        @Nullable VkAllocationCallbacks vulkanAllocator
    ) {
        type(type);
        next(next);
        systemId(systemId);
        createFlags(createFlags);
        pfnGetInstanceProcAddr(pfnGetInstanceProcAddr);
        vulkanCreateInfo(vulkanCreateInfo);
        vulkanAllocator(vulkanAllocator);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVulkanInstanceCreateInfoKHR set(XrVulkanInstanceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVulkanInstanceCreateInfoKHR malloc() {
        return wrap(XrVulkanInstanceCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVulkanInstanceCreateInfoKHR calloc() {
        return wrap(XrVulkanInstanceCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrVulkanInstanceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVulkanInstanceCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance for the specified memory address. */
    public static XrVulkanInstanceCreateInfoKHR create(long address) {
        return wrap(XrVulkanInstanceCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanInstanceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrVulkanInstanceCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanInstanceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrVulkanInstanceCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrVulkanInstanceCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanInstanceCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(XrVulkanInstanceCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVulkanInstanceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanInstanceCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(XrVulkanInstanceCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanInstanceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanInstanceCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVulkanInstanceCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.NEXT); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return UNSAFE.getLong(null, struct + XrVulkanInstanceCreateInfoKHR.SYSTEMID); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrVulkanInstanceCreateInfoKHR.CREATEFLAGS); }
    /** Unsafe version of {@link #pfnGetInstanceProcAddr}. */
    public static long npfnGetInstanceProcAddr(long struct) { return memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.PFNGETINSTANCEPROCADDR); }
    /** Unsafe version of {@link #vulkanCreateInfo}. */
    public static VkInstanceCreateInfo nvulkanCreateInfo(long struct) { return VkInstanceCreateInfo.create(memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.VULKANCREATEINFO)); }
    /** Unsafe version of {@link #vulkanAllocator}. */
    @Nullable public static VkAllocationCallbacks nvulkanAllocator(long struct) { return VkAllocationCallbacks.createSafe(memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.VULKANALLOCATOR)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanInstanceCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVulkanInstanceCreateInfoKHR.NEXT, value); }
    /** Unsafe version of {@link #systemId(long) systemId}. */
    public static void nsystemId(long struct, long value) { UNSAFE.putLong(null, struct + XrVulkanInstanceCreateInfoKHR.SYSTEMID, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrVulkanInstanceCreateInfoKHR.CREATEFLAGS, value); }
    /** Unsafe version of {@link #pfnGetInstanceProcAddr(long) pfnGetInstanceProcAddr}. */
    public static void npfnGetInstanceProcAddr(long struct, long value) { memPutAddress(struct + XrVulkanInstanceCreateInfoKHR.PFNGETINSTANCEPROCADDR, check(value)); }
    /** Unsafe version of {@link #vulkanCreateInfo(VkInstanceCreateInfo) vulkanCreateInfo}. */
    public static void nvulkanCreateInfo(long struct, VkInstanceCreateInfo value) { memPutAddress(struct + XrVulkanInstanceCreateInfoKHR.VULKANCREATEINFO, value.address()); }
    /** Unsafe version of {@link #vulkanAllocator(VkAllocationCallbacks) vulkanAllocator}. */
    public static void nvulkanAllocator(long struct, @Nullable VkAllocationCallbacks value) { memPutAddress(struct + XrVulkanInstanceCreateInfoKHR.VULKANALLOCATOR, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.PFNGETINSTANCEPROCADDR));
        long vulkanCreateInfo = memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.VULKANCREATEINFO);
        check(vulkanCreateInfo);
        VkInstanceCreateInfo.validate(vulkanCreateInfo);
        long vulkanAllocator = memGetAddress(struct + XrVulkanInstanceCreateInfoKHR.VULKANALLOCATOR);
        if (vulkanAllocator != NULL) {
            VkAllocationCallbacks.validate(vulkanAllocator);
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrVulkanInstanceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<XrVulkanInstanceCreateInfoKHR, Buffer> implements NativeResource {

        private static final XrVulkanInstanceCreateInfoKHR ELEMENT_FACTORY = XrVulkanInstanceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code XrVulkanInstanceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVulkanInstanceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrVulkanInstanceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVulkanInstanceCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVulkanInstanceCreateInfoKHR.nnext(address()); }
        /** @return the value of the {@code systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrVulkanInstanceCreateInfoKHR.nsystemId(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("XrVulkanInstanceCreateFlagsKHR")
        public long createFlags() { return XrVulkanInstanceCreateInfoKHR.ncreateFlags(address()); }
        /** @return the value of the {@code pfnGetInstanceProcAddr} field. */
        @NativeType("PFN_vkGetInstanceProcAddr")
        public long pfnGetInstanceProcAddr() { return XrVulkanInstanceCreateInfoKHR.npfnGetInstanceProcAddr(address()); }
        /** @return a {@link VkInstanceCreateInfo} view of the struct pointed to by the {@code vulkanCreateInfo} field. */
        @NativeType("VkInstanceCreateInfo const *")
        public VkInstanceCreateInfo vulkanCreateInfo() { return XrVulkanInstanceCreateInfoKHR.nvulkanCreateInfo(address()); }
        /** @return a {@link VkAllocationCallbacks} view of the struct pointed to by the {@code vulkanAllocator} field. */
        @Nullable
        @NativeType("VkAllocationCallbacks const *")
        public VkAllocationCallbacks vulkanAllocator() { return XrVulkanInstanceCreateInfoKHR.nvulkanAllocator(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrVulkanInstanceCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer next(@NativeType("void const *") long value) { XrVulkanInstanceCreateInfoKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code systemId} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer systemId(@NativeType("XrSystemId") long value) { XrVulkanInstanceCreateInfoKHR.nsystemId(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer createFlags(@NativeType("XrVulkanInstanceCreateFlagsKHR") long value) { XrVulkanInstanceCreateInfoKHR.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code pfnGetInstanceProcAddr} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { XrVulkanInstanceCreateInfoKHR.npfnGetInstanceProcAddr(address(), value); return this; }
        /** Sets the address of the specified {@link VkInstanceCreateInfo} to the {@code vulkanCreateInfo} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer vulkanCreateInfo(@NativeType("VkInstanceCreateInfo const *") VkInstanceCreateInfo value) { XrVulkanInstanceCreateInfoKHR.nvulkanCreateInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@code vulkanAllocator} field. */
        public XrVulkanInstanceCreateInfoKHR.Buffer vulkanAllocator(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { XrVulkanInstanceCreateInfoKHR.nvulkanAllocator(address(), value); return this; }

    }

}