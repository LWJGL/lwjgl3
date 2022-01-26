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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the extended vertex input binding description.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code binding} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindings}</li>
 * <li>{@code stride} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxVertexInputBindingStride}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexAttributeInstanceRateZeroDivisor">vertexAttributeInstanceRateZeroDivisor</a> feature is not enabled, {@code divisor} <b>must</b> not be 0</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexAttributeInstanceRateDivisor">vertexAttributeInstanceRateDivisor</a> feature is not enabled, {@code divisor} <b>must</b> be 1</li>
 * <li>{@code divisor} <b>must</b> be a value between 0 and {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT}{@code ::maxVertexAttribDivisor}, inclusive</li>
 * <li>If {@code divisor} is not 1 then {@code inputRate} <b>must</b> be of type {@link VK10#VK_VERTEX_INPUT_RATE_INSTANCE VERTEX_INPUT_RATE_INSTANCE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVertexInputDynamicState#VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT}</li>
 * <li>{@code inputRate} <b>must</b> be a valid {@code VkVertexInputRate} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVertexInputBindingDescription2EXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #binding};
 *     uint32_t {@link #stride};
 *     VkVertexInputRate {@link #inputRate};
 *     uint32_t {@link #divisor};
 * }</code></pre>
 */
public class VkVertexInputBindingDescription2EXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BINDING,
        STRIDE,
        INPUTRATE,
        DIVISOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
        INPUTRATE = layout.offsetof(4);
        DIVISOR = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkVertexInputBindingDescription2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVertexInputBindingDescription2EXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the binding number that this structure describes. */
    @NativeType("uint32_t")
    public int binding() { return nbinding(address()); }
    /** the byte stride between consecutive elements within the buffer. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** a {@code VkVertexInputRate} value specifying whether vertex attribute addressing is a function of the vertex index or of the instance index. */
    @NativeType("VkVertexInputRate")
    public int inputRate() { return ninputRate(address()); }
    /** the number of successive instances that will use the same value of the vertex attribute when instanced rendering is enabled. This member <b>can</b> be set to a value other than 1 if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexAttributeInstanceRateDivisor">vertexAttributeInstanceRateDivisor</a> feature is enabled. For example, if the divisor is N, the same vertex attribute will be applied to N successive instances before moving on to the next vertex attribute. The maximum value of {@code divisor} is implementation-dependent and can be queried using {@link VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT}{@code ::maxVertexAttribDivisor}. A value of 0 <b>can</b> be used for the divisor if the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-vertexAttributeInstanceRateZeroDivisor">{@code vertexAttributeInstanceRateZeroDivisor}</a> feature is enabled. In this case, the same vertex attribute will be applied to all instances. */
    @NativeType("uint32_t")
    public int divisor() { return ndivisor(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVertexInputBindingDescription2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVertexInputDynamicState#VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT} value to the {@link #sType} field. */
    public VkVertexInputBindingDescription2EXT sType$Default() { return sType(EXTVertexInputDynamicState.VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVertexInputBindingDescription2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #binding} field. */
    public VkVertexInputBindingDescription2EXT binding(@NativeType("uint32_t") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public VkVertexInputBindingDescription2EXT stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@link #inputRate} field. */
    public VkVertexInputBindingDescription2EXT inputRate(@NativeType("VkVertexInputRate") int value) { ninputRate(address(), value); return this; }
    /** Sets the specified value to the {@link #divisor} field. */
    public VkVertexInputBindingDescription2EXT divisor(@NativeType("uint32_t") int value) { ndivisor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVertexInputBindingDescription2EXT set(
        int sType,
        long pNext,
        int binding,
        int stride,
        int inputRate,
        int divisor
    ) {
        sType(sType);
        pNext(pNext);
        binding(binding);
        stride(stride);
        inputRate(inputRate);
        divisor(divisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVertexInputBindingDescription2EXT set(VkVertexInputBindingDescription2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription2EXT malloc() {
        return wrap(VkVertexInputBindingDescription2EXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVertexInputBindingDescription2EXT calloc() {
        return wrap(VkVertexInputBindingDescription2EXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated with {@link BufferUtils}. */
    public static VkVertexInputBindingDescription2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVertexInputBindingDescription2EXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVertexInputBindingDescription2EXT} instance for the specified memory address. */
    public static VkVertexInputBindingDescription2EXT create(long address) {
        return wrap(VkVertexInputBindingDescription2EXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDescription2EXT createSafe(long address) {
        return address == NULL ? null : wrap(VkVertexInputBindingDescription2EXT.class, address);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVertexInputBindingDescription2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVertexInputBindingDescription2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription2EXT malloc(MemoryStack stack) {
        return wrap(VkVertexInputBindingDescription2EXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVertexInputBindingDescription2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVertexInputBindingDescription2EXT calloc(MemoryStack stack) {
        return wrap(VkVertexInputBindingDescription2EXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVertexInputBindingDescription2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVertexInputBindingDescription2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVertexInputBindingDescription2EXT.PNEXT); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription2EXT.BINDING); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription2EXT.STRIDE); }
    /** Unsafe version of {@link #inputRate}. */
    public static int ninputRate(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription2EXT.INPUTRATE); }
    /** Unsafe version of {@link #divisor}. */
    public static int ndivisor(long struct) { return UNSAFE.getInt(null, struct + VkVertexInputBindingDescription2EXT.DIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVertexInputBindingDescription2EXT.PNEXT, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription2EXT.BINDING, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription2EXT.STRIDE, value); }
    /** Unsafe version of {@link #inputRate(int) inputRate}. */
    public static void ninputRate(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription2EXT.INPUTRATE, value); }
    /** Unsafe version of {@link #divisor(int) divisor}. */
    public static void ndivisor(long struct, int value) { UNSAFE.putInt(null, struct + VkVertexInputBindingDescription2EXT.DIVISOR, value); }

    // -----------------------------------

    /** An array of {@link VkVertexInputBindingDescription2EXT} structs. */
    public static class Buffer extends StructBuffer<VkVertexInputBindingDescription2EXT, Buffer> implements NativeResource {

        private static final VkVertexInputBindingDescription2EXT ELEMENT_FACTORY = VkVertexInputBindingDescription2EXT.create(-1L);

        /**
         * Creates a new {@code VkVertexInputBindingDescription2EXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVertexInputBindingDescription2EXT#SIZEOF}, and its mark will be undefined.
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
        protected VkVertexInputBindingDescription2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVertexInputBindingDescription2EXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVertexInputBindingDescription2EXT.nsType(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription2EXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVertexInputBindingDescription2EXT.npNext(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription2EXT#binding} field. */
        @NativeType("uint32_t")
        public int binding() { return VkVertexInputBindingDescription2EXT.nbinding(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription2EXT#stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkVertexInputBindingDescription2EXT.nstride(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription2EXT#inputRate} field. */
        @NativeType("VkVertexInputRate")
        public int inputRate() { return VkVertexInputBindingDescription2EXT.ninputRate(address()); }
        /** @return the value of the {@link VkVertexInputBindingDescription2EXT#divisor} field. */
        @NativeType("uint32_t")
        public int divisor() { return VkVertexInputBindingDescription2EXT.ndivisor(address()); }

        /** Sets the specified value to the {@link VkVertexInputBindingDescription2EXT#sType} field. */
        public VkVertexInputBindingDescription2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVertexInputBindingDescription2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVertexInputDynamicState#VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT} value to the {@link VkVertexInputBindingDescription2EXT#sType} field. */
        public VkVertexInputBindingDescription2EXT.Buffer sType$Default() { return sType(EXTVertexInputDynamicState.VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT); }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription2EXT#pNext} field. */
        public VkVertexInputBindingDescription2EXT.Buffer pNext(@NativeType("void *") long value) { VkVertexInputBindingDescription2EXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription2EXT#binding} field. */
        public VkVertexInputBindingDescription2EXT.Buffer binding(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription2EXT#stride} field. */
        public VkVertexInputBindingDescription2EXT.Buffer stride(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.nstride(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription2EXT#inputRate} field. */
        public VkVertexInputBindingDescription2EXT.Buffer inputRate(@NativeType("VkVertexInputRate") int value) { VkVertexInputBindingDescription2EXT.ninputRate(address(), value); return this; }
        /** Sets the specified value to the {@link VkVertexInputBindingDescription2EXT#divisor} field. */
        public VkVertexInputBindingDescription2EXT.Buffer divisor(@NativeType("uint32_t") int value) { VkVertexInputBindingDescription2EXT.ndivisor(address(), value); return this; }

    }

}