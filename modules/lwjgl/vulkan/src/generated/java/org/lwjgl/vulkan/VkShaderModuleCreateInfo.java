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
 * Structure specifying parameters of a newly created shader module.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code codeSize} <b>must</b> be greater than 0</li>
 * <li>If {@code pCode} is a pointer to SPIR-V code, {@code codeSize} <b>must</b> be a multiple of 4</li>
 * <li>{@code pCode} <b>must</b> point to either valid SPIR-V code, formatted and packed as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirv-spec">Khronos SPIR-V Specification</a> or valid GLSL code which <b>must</b> be written to the {@code GL_KHR_vulkan_glsl} extension specification</li>
 * <li>If {@code pCode} is a pointer to SPIR-V code, that code <b>must</b> adhere to the validation rules described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-module-validation">Validation Rules within a Module</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code pCode} is a pointer to GLSL code, it <b>must</b> be valid GLSL code written to the {@code GL_KHR_vulkan_glsl} GLSL extension specification</li>
 * <li>{@code pCode} <b>must</b> declare the {@code Shader} capability for SPIR-V code</li>
 * <li>{@code pCode} <b>must</b> not declare any capability that is not supported by the API, as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-module-validation">Capabilities</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code pCode} declares any of the capabilities listed in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities-table">SPIR-V Environment</a> appendix, one of the corresponding requirements <b>must</b> be satisfied</li>
 * <li>{@code pCode} <b>must</b> not declare any SPIR-V extension that is not supported by the API, as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-extensions">Extension</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code pCode} declares any of the SPIR-V extensions listed in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#spirvenv-extensions-table">SPIR-V Environment</a> appendix, one of the corresponding requirements <b>must</b> be satisfied</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkShaderModuleValidationCacheCreateInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pCode} <b>must</b> be a valid pointer to an array of {@code codeSize / 4} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateShaderModule CreateShaderModule}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShaderModuleCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkShaderModuleCreateFlags {@link #flags};
 *     size_t {@link #codeSize};
 *     uint32_t const * {@link #pCode};
 * }</code></pre>
 */
public class VkShaderModuleCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CODESIZE,
        PCODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CODESIZE = layout.offsetof(3);
        PCODE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkShaderModuleCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderModuleCreateInfo(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkShaderModuleCreateFlags")
    public int flags() { return nflags(address()); }
    /** the size, in bytes, of the code pointed to by {@code pCode}. */
    @NativeType("size_t")
    public long codeSize() { return ncodeSize(address()); }
    /** points to code that is used to create the shader module */
    @NativeType("uint32_t const *")
    public ByteBuffer pCode() { return npCode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkShaderModuleCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO} value to the {@link #sType} field. */
    public VkShaderModuleCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkShaderModuleCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkShaderModuleValidationCacheCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderModuleCreateInfo pNext(VkShaderModuleValidationCacheCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkShaderModuleCreateInfo flags(@NativeType("VkShaderModuleCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pCode} field. */
    public VkShaderModuleCreateInfo pCode(@NativeType("uint32_t const *") ByteBuffer value) { npCode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderModuleCreateInfo set(
        int sType,
        long pNext,
        int flags,
        ByteBuffer pCode
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pCode(pCode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderModuleCreateInfo set(VkShaderModuleCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderModuleCreateInfo malloc() {
        return wrap(VkShaderModuleCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderModuleCreateInfo calloc() {
        return wrap(VkShaderModuleCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkShaderModuleCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkShaderModuleCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance for the specified memory address. */
    public static VkShaderModuleCreateInfo create(long address) {
        return wrap(VkShaderModuleCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderModuleCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkShaderModuleCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkShaderModuleCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderModuleCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShaderModuleCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleCreateInfo malloc(MemoryStack stack) {
        return wrap(VkShaderModuleCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleCreateInfo calloc(MemoryStack stack) {
        return wrap(VkShaderModuleCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkShaderModuleCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkShaderModuleCreateInfo.FLAGS); }
    /** Unsafe version of {@link #codeSize}. */
    public static long ncodeSize(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.CODESIZE); }
    /** Unsafe version of {@link #pCode() pCode}. */
    public static ByteBuffer npCode(long struct) { return memByteBuffer(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE), (int)ncodeSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderModuleCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderModuleCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code codeSize} field of the specified {@code struct}. */
    public static void ncodeSize(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.CODESIZE, value); }
    /** Unsafe version of {@link #pCode(ByteBuffer) pCode}. */
    public static void npCode(long struct, ByteBuffer value) { memPutAddress(struct + VkShaderModuleCreateInfo.PCODE, memAddress(value)); ncodeSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE));
    }

    // -----------------------------------

    /** An array of {@link VkShaderModuleCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkShaderModuleCreateInfo, Buffer> implements NativeResource {

        private static final VkShaderModuleCreateInfo ELEMENT_FACTORY = VkShaderModuleCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkShaderModuleCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderModuleCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkShaderModuleCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkShaderModuleCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderModuleCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkShaderModuleCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkShaderModuleCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkShaderModuleCreateInfo#flags} field. */
        @NativeType("VkShaderModuleCreateFlags")
        public int flags() { return VkShaderModuleCreateInfo.nflags(address()); }
        /** @return the value of the {@link VkShaderModuleCreateInfo#codeSize} field. */
        @NativeType("size_t")
        public long codeSize() { return VkShaderModuleCreateInfo.ncodeSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkShaderModuleCreateInfo#pCode} field. */
        @NativeType("uint32_t const *")
        public ByteBuffer pCode() { return VkShaderModuleCreateInfo.npCode(address()); }

        /** Sets the specified value to the {@link VkShaderModuleCreateInfo#sType} field. */
        public VkShaderModuleCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderModuleCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO} value to the {@link VkShaderModuleCreateInfo#sType} field. */
        public VkShaderModuleCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkShaderModuleCreateInfo#pNext} field. */
        public VkShaderModuleCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkShaderModuleCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkShaderModuleValidationCacheCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderModuleCreateInfo.Buffer pNext(VkShaderModuleValidationCacheCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkShaderModuleCreateInfo#flags} field. */
        public VkShaderModuleCreateInfo.Buffer flags(@NativeType("VkShaderModuleCreateFlags") int value) { VkShaderModuleCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkShaderModuleCreateInfo#pCode} field. */
        public VkShaderModuleCreateInfo.Buffer pCode(@NativeType("uint32_t const *") ByteBuffer value) { VkShaderModuleCreateInfo.npCode(address(), value); return this; }

    }

}