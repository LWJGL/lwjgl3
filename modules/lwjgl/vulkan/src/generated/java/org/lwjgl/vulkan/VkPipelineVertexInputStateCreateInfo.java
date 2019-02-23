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
 * Structure specifying parameters of a newly created pipeline vertex input state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code vertexBindingDescriptionCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>{@code vertexAttributeDescriptionCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputAttributes}</li>
 * <li>For every {@code binding} specified by each element of {@code pVertexAttributeDescriptions}, a {@link VkVertexInputBindingDescription} <b>must</b> exist in {@code pVertexBindingDescriptions} with the same value of {@code binding}</li>
 * <li>All elements of {@code pVertexBindingDescriptions} <b>must</b> describe distinct binding numbers</li>
 * <li>All elements of {@code pVertexAttributeDescriptions} <b>must</b> describe distinct attribute locations</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineVertexInputDivisorStateCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code vertexBindingDescriptionCount} is not 0, {@code pVertexBindingDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexBindingDescriptionCount} valid {@link VkVertexInputBindingDescription} structures</li>
 * <li>If {@code vertexAttributeDescriptionCount} is not 0, {@code pVertexAttributeDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexAttributeDescriptionCount} valid {@link VkVertexInputAttributeDescription} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}, {@link VkVertexInputAttributeDescription}, {@link VkVertexInputBindingDescription}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code vertexBindingDescriptionCount} &ndash; the number of vertex binding descriptions provided in {@code pVertexBindingDescriptions}.</li>
 * <li>{@code pVertexBindingDescriptions} &ndash; a pointer to an array of {@link VkVertexInputBindingDescription} structures.</li>
 * <li>{@code vertexAttributeDescriptionCount} &ndash; the number of vertex attribute descriptions provided in {@code pVertexAttributeDescriptions}.</li>
 * <li>{@code pVertexAttributeDescriptions} &ndash; a pointer to an array of {@link VkVertexInputAttributeDescription} structures.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineVertexInputStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineVertexInputStateCreateFlags flags;
 *     uint32_t vertexBindingDescriptionCount;
 *     {@link VkVertexInputBindingDescription VkVertexInputBindingDescription} const * pVertexBindingDescriptions;
 *     uint32_t vertexAttributeDescriptionCount;
 *     {@link VkVertexInputAttributeDescription VkVertexInputAttributeDescription} const * pVertexAttributeDescriptions;
 * }</code></pre>
 */
public class VkPipelineVertexInputStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        VERTEXBINDINGDESCRIPTIONCOUNT,
        PVERTEXBINDINGDESCRIPTIONS,
        VERTEXATTRIBUTEDESCRIPTIONCOUNT,
        PVERTEXATTRIBUTEDESCRIPTIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VERTEXBINDINGDESCRIPTIONCOUNT = layout.offsetof(3);
        PVERTEXBINDINGDESCRIPTIONS = layout.offsetof(4);
        VERTEXATTRIBUTEDESCRIPTIONCOUNT = layout.offsetof(5);
        PVERTEXATTRIBUTEDESCRIPTIONS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPipelineVertexInputStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineVertexInputStateCreateInfo(ByteBuffer container) {
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
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineVertexInputStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code vertexBindingDescriptionCount} field. */
    @NativeType("uint32_t")
    public int vertexBindingDescriptionCount() { return nvertexBindingDescriptionCount(address()); }
    /** Returns a {@link VkVertexInputBindingDescription.Buffer} view of the struct array pointed to by the {@code pVertexBindingDescriptions} field. */
    @Nullable
    @NativeType("VkVertexInputBindingDescription const *")
    public VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions() { return npVertexBindingDescriptions(address()); }
    /** Returns the value of the {@code vertexAttributeDescriptionCount} field. */
    @NativeType("uint32_t")
    public int vertexAttributeDescriptionCount() { return nvertexAttributeDescriptionCount(address()); }
    /** Returns a {@link VkVertexInputAttributeDescription.Buffer} view of the struct array pointed to by the {@code pVertexAttributeDescriptions} field. */
    @Nullable
    @NativeType("VkVertexInputAttributeDescription const *")
    public VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions() { return npVertexAttributeDescriptions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineVertexInputStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineVertexInputStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineVertexInputStateCreateInfo flags(@NativeType("VkPipelineVertexInputStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputBindingDescription.Buffer} to the {@code pVertexBindingDescriptions} field. */
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(@Nullable @NativeType("VkVertexInputBindingDescription const *") VkVertexInputBindingDescription.Buffer value) { npVertexBindingDescriptions(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputAttributeDescription.Buffer} to the {@code pVertexAttributeDescriptions} field. */
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(@Nullable @NativeType("VkVertexInputAttributeDescription const *") VkVertexInputAttributeDescription.Buffer value) { npVertexAttributeDescriptions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineVertexInputStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions,
        @Nullable VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pVertexBindingDescriptions(pVertexBindingDescriptions);
        pVertexAttributeDescriptions(pVertexAttributeDescriptions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineVertexInputStateCreateInfo set(VkPipelineVertexInputStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputStateCreateInfo malloc() {
        return wrap(VkPipelineVertexInputStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputStateCreateInfo calloc() {
        return wrap(VkPipelineVertexInputStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineVertexInputStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineVertexInputStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineVertexInputStateCreateInfo create(long address) {
        return wrap(VkPipelineVertexInputStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineVertexInputStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineVertexInputStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineVertexInputStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineVertexInputStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineVertexInputStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputStateCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkPipelineVertexInputStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineVertexInputStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputStateCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkPipelineVertexInputStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineVertexInputStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineVertexInputStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #vertexBindingDescriptionCount}. */
    public static int nvertexBindingDescriptionCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineVertexInputStateCreateInfo.VERTEXBINDINGDESCRIPTIONCOUNT); }
    /** Unsafe version of {@link #pVertexBindingDescriptions}. */
    @Nullable public static VkVertexInputBindingDescription.Buffer npVertexBindingDescriptions(long struct) { return VkVertexInputBindingDescription.createSafe(memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS), nvertexBindingDescriptionCount(struct)); }
    /** Unsafe version of {@link #vertexAttributeDescriptionCount}. */
    public static int nvertexAttributeDescriptionCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineVertexInputStateCreateInfo.VERTEXATTRIBUTEDESCRIPTIONCOUNT); }
    /** Unsafe version of {@link #pVertexAttributeDescriptions}. */
    @Nullable public static VkVertexInputAttributeDescription.Buffer npVertexAttributeDescriptions(long struct) { return VkVertexInputAttributeDescription.createSafe(memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS), nvertexAttributeDescriptionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineVertexInputStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineVertexInputStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineVertexInputStateCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code vertexBindingDescriptionCount} field of the specified {@code struct}. */
    public static void nvertexBindingDescriptionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineVertexInputStateCreateInfo.VERTEXBINDINGDESCRIPTIONCOUNT, value); }
    /** Unsafe version of {@link #pVertexBindingDescriptions(VkVertexInputBindingDescription.Buffer) pVertexBindingDescriptions}. */
    public static void npVertexBindingDescriptions(long struct, @Nullable VkVertexInputBindingDescription.Buffer value) { memPutAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS, memAddressSafe(value)); nvertexBindingDescriptionCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code vertexAttributeDescriptionCount} field of the specified {@code struct}. */
    public static void nvertexAttributeDescriptionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineVertexInputStateCreateInfo.VERTEXATTRIBUTEDESCRIPTIONCOUNT, value); }
    /** Unsafe version of {@link #pVertexAttributeDescriptions(VkVertexInputAttributeDescription.Buffer) pVertexAttributeDescriptions}. */
    public static void npVertexAttributeDescriptions(long struct, @Nullable VkVertexInputAttributeDescription.Buffer value) { memPutAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS, memAddressSafe(value)); nvertexAttributeDescriptionCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nvertexBindingDescriptionCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXBINDINGDESCRIPTIONS));
        }
        if (nvertexAttributeDescriptionCount(struct) != 0) {
            check(memGetAddress(struct + VkPipelineVertexInputStateCreateInfo.PVERTEXATTRIBUTEDESCRIPTIONS));
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

    /** An array of {@link VkPipelineVertexInputStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineVertexInputStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineVertexInputStateCreateInfo ELEMENT_FACTORY = VkPipelineVertexInputStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineVertexInputStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineVertexInputStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineVertexInputStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineVertexInputStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineVertexInputStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineVertexInputStateCreateFlags")
        public int flags() { return VkPipelineVertexInputStateCreateInfo.nflags(address()); }
        /** Returns the value of the {@code vertexBindingDescriptionCount} field. */
        @NativeType("uint32_t")
        public int vertexBindingDescriptionCount() { return VkPipelineVertexInputStateCreateInfo.nvertexBindingDescriptionCount(address()); }
        /** Returns a {@link VkVertexInputBindingDescription.Buffer} view of the struct array pointed to by the {@code pVertexBindingDescriptions} field. */
        @Nullable
        @NativeType("VkVertexInputBindingDescription const *")
        public VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions() { return VkPipelineVertexInputStateCreateInfo.npVertexBindingDescriptions(address()); }
        /** Returns the value of the {@code vertexAttributeDescriptionCount} field. */
        @NativeType("uint32_t")
        public int vertexAttributeDescriptionCount() { return VkPipelineVertexInputStateCreateInfo.nvertexAttributeDescriptionCount(address()); }
        /** Returns a {@link VkVertexInputAttributeDescription.Buffer} view of the struct array pointed to by the {@code pVertexAttributeDescriptions} field. */
        @Nullable
        @NativeType("VkVertexInputAttributeDescription const *")
        public VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions() { return VkPipelineVertexInputStateCreateInfo.npVertexAttributeDescriptions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineVertexInputStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineVertexInputStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineVertexInputStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineVertexInputStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineVertexInputStateCreateInfo.Buffer flags(@NativeType("VkPipelineVertexInputStateCreateFlags") int value) { VkPipelineVertexInputStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputBindingDescription.Buffer} to the {@code pVertexBindingDescriptions} field. */
        public VkPipelineVertexInputStateCreateInfo.Buffer pVertexBindingDescriptions(@Nullable @NativeType("VkVertexInputBindingDescription const *") VkVertexInputBindingDescription.Buffer value) { VkPipelineVertexInputStateCreateInfo.npVertexBindingDescriptions(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputAttributeDescription.Buffer} to the {@code pVertexAttributeDescriptions} field. */
        public VkPipelineVertexInputStateCreateInfo.Buffer pVertexAttributeDescriptions(@Nullable @NativeType("VkVertexInputAttributeDescription const *") VkVertexInputAttributeDescription.Buffer value) { VkPipelineVertexInputStateCreateInfo.npVertexAttributeDescriptions(address(), value); return this; }

    }

}