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
 * Structure describing properties supported by VK_KHR_shader_float_controls.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFloatControlsPropertiesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderFloatControls#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code separateDenormSettings} &ndash; a boolean value indicating whether the implementation supports separate settings for 16-bit and 64-bit denormals.</li>
 * <li>{@code separateRoundingModeSettings} &ndash; a boolean value indicating whether the implementation supports separate rounding modes for 16-bit and 64-bit floating point instructions.</li>
 * <li>{@code shaderSignedZeroInfNanPreserveFloat16} &ndash; a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 16-bit floating-point types.</li>
 * <li>{@code shaderSignedZeroInfNanPreserveFloat32} &ndash; a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 32-bit floating-point types.</li>
 * <li>{@code shaderSignedZeroInfNanPreserveFloat64} &ndash; a boolean value indicating whether sign of a zero, <code>Nan</code>s and &plusmn;&infin; <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code SignedZeroInfNanPreserve} execution mode <b>can</b> be used for 64-bit floating-point types.</li>
 * <li>{@code shaderDenormPreserveFloat16} &ndash; a boolean value indicating whether denormals <b>can</b> be preserved in 16-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 16-bit floating-point types.</li>
 * <li>{@code shaderDenormPreserveFloat32} &ndash; a boolean value indicating whether denormals <b>can</b> be preserved in 32-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 32-bit floating-point types.</li>
 * <li>{@code shaderDenormPreserveFloat64} &ndash; a boolean value indicating whether denormals <b>can</b> be preserved in 64-bit floating-point computations. It also indicates whether the {@code DenormPreserve} execution mode <b>can</b> be used for 64-bit floating-point types.</li>
 * <li>{@code shaderDenormFlushToZeroFloat16} &ndash; a boolean value indicating whether denormals <b>can</b> be flushed to zero in 16-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 16-bit floating-point types.</li>
 * <li>{@code shaderDenormFlushToZeroFloat32} &ndash; a boolean value indicating whether denormals <b>can</b> be flushed to zero in 32-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 32-bit floating-point types.</li>
 * <li>{@code shaderDenormFlushToZeroFloat64} &ndash; a boolean value indicating whether denormals <b>can</b> be flushed to zero in 64-bit floating-point computations. It also indicates whether the {@code DenormFlushToZero} execution mode <b>can</b> be used for 64-bit floating-point types.</li>
 * <li>{@code shaderRoundingModeRTEFloat16} &ndash; a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 16-bit floating-point types.</li>
 * <li>{@code shaderRoundingModeRTEFloat32} &ndash; a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 32-bit floating-point types.</li>
 * <li>{@code shaderRoundingModeRTEFloat64} &ndash; a boolean value indicating whether an implementation supports the round-to-nearest-even rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTE} execution mode <b>can</b> be used for 64-bit floating-point types.</li>
 * <li>{@code shaderRoundingModeRTZFloat16} &ndash; a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 16-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 16-bit floating-point types.</li>
 * <li>{@code shaderRoundingModeRTZFloat32} &ndash; a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 32-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 32-bit floating-point types.</li>
 * <li>{@code shaderRoundingModeRTZFloat64} &ndash; a boolean value indicating whether an implementation supports the round-towards-zero rounding mode for 64-bit floating-point arithmetic and conversion instructions. It also indicates whether the {@code RoundingModeRTZ} execution mode <b>can</b> be used for 64-bit floating-point types.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFloatControlsPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 separateDenormSettings;
 *     VkBool32 separateRoundingModeSettings;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat16;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat32;
 *     VkBool32 shaderSignedZeroInfNanPreserveFloat64;
 *     VkBool32 shaderDenormPreserveFloat16;
 *     VkBool32 shaderDenormPreserveFloat32;
 *     VkBool32 shaderDenormPreserveFloat64;
 *     VkBool32 shaderDenormFlushToZeroFloat16;
 *     VkBool32 shaderDenormFlushToZeroFloat32;
 *     VkBool32 shaderDenormFlushToZeroFloat64;
 *     VkBool32 shaderRoundingModeRTEFloat16;
 *     VkBool32 shaderRoundingModeRTEFloat32;
 *     VkBool32 shaderRoundingModeRTEFloat64;
 *     VkBool32 shaderRoundingModeRTZFloat16;
 *     VkBool32 shaderRoundingModeRTZFloat32;
 *     VkBool32 shaderRoundingModeRTZFloat64;
 * }</code></pre>
 */
public class VkPhysicalDeviceFloatControlsPropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEPARATEDENORMSETTINGS,
        SEPARATEROUNDINGMODESETTINGS,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32,
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64,
        SHADERDENORMPRESERVEFLOAT16,
        SHADERDENORMPRESERVEFLOAT32,
        SHADERDENORMPRESERVEFLOAT64,
        SHADERDENORMFLUSHTOZEROFLOAT16,
        SHADERDENORMFLUSHTOZEROFLOAT32,
        SHADERDENORMFLUSHTOZEROFLOAT64,
        SHADERROUNDINGMODERTEFLOAT16,
        SHADERROUNDINGMODERTEFLOAT32,
        SHADERROUNDINGMODERTEFLOAT64,
        SHADERROUNDINGMODERTZFLOAT16,
        SHADERROUNDINGMODERTZFLOAT32,
        SHADERROUNDINGMODERTZFLOAT64;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEPARATEDENORMSETTINGS = layout.offsetof(2);
        SEPARATEROUNDINGMODESETTINGS = layout.offsetof(3);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT16 = layout.offsetof(4);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT32 = layout.offsetof(5);
        SHADERSIGNEDZEROINFNANPRESERVEFLOAT64 = layout.offsetof(6);
        SHADERDENORMPRESERVEFLOAT16 = layout.offsetof(7);
        SHADERDENORMPRESERVEFLOAT32 = layout.offsetof(8);
        SHADERDENORMPRESERVEFLOAT64 = layout.offsetof(9);
        SHADERDENORMFLUSHTOZEROFLOAT16 = layout.offsetof(10);
        SHADERDENORMFLUSHTOZEROFLOAT32 = layout.offsetof(11);
        SHADERDENORMFLUSHTOZEROFLOAT64 = layout.offsetof(12);
        SHADERROUNDINGMODERTEFLOAT16 = layout.offsetof(13);
        SHADERROUNDINGMODERTEFLOAT32 = layout.offsetof(14);
        SHADERROUNDINGMODERTEFLOAT64 = layout.offsetof(15);
        SHADERROUNDINGMODERTZFLOAT16 = layout.offsetof(16);
        SHADERROUNDINGMODERTZFLOAT32 = layout.offsetof(17);
        SHADERROUNDINGMODERTZFLOAT64 = layout.offsetof(18);
    }

    /**
     * Creates a {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFloatControlsPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code separateDenormSettings} field. */
    @NativeType("VkBool32")
    public boolean separateDenormSettings() { return nseparateDenormSettings(address()) != 0; }
    /** Returns the value of the {@code separateRoundingModeSettings} field. */
    @NativeType("VkBool32")
    public boolean separateRoundingModeSettings() { return nseparateRoundingModeSettings(address()) != 0; }
    /** Returns the value of the {@code shaderSignedZeroInfNanPreserveFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat16() { return nshaderSignedZeroInfNanPreserveFloat16(address()) != 0; }
    /** Returns the value of the {@code shaderSignedZeroInfNanPreserveFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat32() { return nshaderSignedZeroInfNanPreserveFloat32(address()) != 0; }
    /** Returns the value of the {@code shaderSignedZeroInfNanPreserveFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderSignedZeroInfNanPreserveFloat64() { return nshaderSignedZeroInfNanPreserveFloat64(address()) != 0; }
    /** Returns the value of the {@code shaderDenormPreserveFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat16() { return nshaderDenormPreserveFloat16(address()) != 0; }
    /** Returns the value of the {@code shaderDenormPreserveFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat32() { return nshaderDenormPreserveFloat32(address()) != 0; }
    /** Returns the value of the {@code shaderDenormPreserveFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderDenormPreserveFloat64() { return nshaderDenormPreserveFloat64(address()) != 0; }
    /** Returns the value of the {@code shaderDenormFlushToZeroFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat16() { return nshaderDenormFlushToZeroFloat16(address()) != 0; }
    /** Returns the value of the {@code shaderDenormFlushToZeroFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat32() { return nshaderDenormFlushToZeroFloat32(address()) != 0; }
    /** Returns the value of the {@code shaderDenormFlushToZeroFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderDenormFlushToZeroFloat64() { return nshaderDenormFlushToZeroFloat64(address()) != 0; }
    /** Returns the value of the {@code shaderRoundingModeRTEFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat16() { return nshaderRoundingModeRTEFloat16(address()) != 0; }
    /** Returns the value of the {@code shaderRoundingModeRTEFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat32() { return nshaderRoundingModeRTEFloat32(address()) != 0; }
    /** Returns the value of the {@code shaderRoundingModeRTEFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTEFloat64() { return nshaderRoundingModeRTEFloat64(address()) != 0; }
    /** Returns the value of the {@code shaderRoundingModeRTZFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat16() { return nshaderRoundingModeRTZFloat16(address()) != 0; }
    /** Returns the value of the {@code shaderRoundingModeRTZFloat32} field. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat32() { return nshaderRoundingModeRTZFloat32(address()) != 0; }
    /** Returns the value of the {@code shaderRoundingModeRTZFloat64} field. */
    @NativeType("VkBool32")
    public boolean shaderRoundingModeRTZFloat64() { return nshaderRoundingModeRTZFloat64(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code separateDenormSettings} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR separateDenormSettings(@NativeType("VkBool32") boolean value) { nseparateDenormSettings(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code separateRoundingModeSettings} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR separateRoundingModeSettings(@NativeType("VkBool32") boolean value) { nseparateRoundingModeSettings(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSignedZeroInfNanPreserveFloat16} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat16(@NativeType("VkBool32") boolean value) { nshaderSignedZeroInfNanPreserveFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSignedZeroInfNanPreserveFloat32} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat32(@NativeType("VkBool32") boolean value) { nshaderSignedZeroInfNanPreserveFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSignedZeroInfNanPreserveFloat64} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderSignedZeroInfNanPreserveFloat64(@NativeType("VkBool32") boolean value) { nshaderSignedZeroInfNanPreserveFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDenormPreserveFloat16} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat16(@NativeType("VkBool32") boolean value) { nshaderDenormPreserveFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDenormPreserveFloat32} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat32(@NativeType("VkBool32") boolean value) { nshaderDenormPreserveFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDenormPreserveFloat64} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormPreserveFloat64(@NativeType("VkBool32") boolean value) { nshaderDenormPreserveFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDenormFlushToZeroFloat16} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat16(@NativeType("VkBool32") boolean value) { nshaderDenormFlushToZeroFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDenormFlushToZeroFloat32} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat32(@NativeType("VkBool32") boolean value) { nshaderDenormFlushToZeroFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDenormFlushToZeroFloat64} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderDenormFlushToZeroFloat64(@NativeType("VkBool32") boolean value) { nshaderDenormFlushToZeroFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderRoundingModeRTEFloat16} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat16(@NativeType("VkBool32") boolean value) { nshaderRoundingModeRTEFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderRoundingModeRTEFloat32} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat32(@NativeType("VkBool32") boolean value) { nshaderRoundingModeRTEFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderRoundingModeRTEFloat64} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTEFloat64(@NativeType("VkBool32") boolean value) { nshaderRoundingModeRTEFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderRoundingModeRTZFloat16} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat16(@NativeType("VkBool32") boolean value) { nshaderRoundingModeRTZFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderRoundingModeRTZFloat32} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat32(@NativeType("VkBool32") boolean value) { nshaderRoundingModeRTZFloat32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderRoundingModeRTZFloat64} field. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR shaderRoundingModeRTZFloat64(@NativeType("VkBool32") boolean value) { nshaderRoundingModeRTZFloat64(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFloatControlsPropertiesKHR set(
        int sType,
        long pNext,
        boolean separateDenormSettings,
        boolean separateRoundingModeSettings,
        boolean shaderSignedZeroInfNanPreserveFloat16,
        boolean shaderSignedZeroInfNanPreserveFloat32,
        boolean shaderSignedZeroInfNanPreserveFloat64,
        boolean shaderDenormPreserveFloat16,
        boolean shaderDenormPreserveFloat32,
        boolean shaderDenormPreserveFloat64,
        boolean shaderDenormFlushToZeroFloat16,
        boolean shaderDenormFlushToZeroFloat32,
        boolean shaderDenormFlushToZeroFloat64,
        boolean shaderRoundingModeRTEFloat16,
        boolean shaderRoundingModeRTEFloat32,
        boolean shaderRoundingModeRTEFloat64,
        boolean shaderRoundingModeRTZFloat16,
        boolean shaderRoundingModeRTZFloat32,
        boolean shaderRoundingModeRTZFloat64
    ) {
        sType(sType);
        pNext(pNext);
        separateDenormSettings(separateDenormSettings);
        separateRoundingModeSettings(separateRoundingModeSettings);
        shaderSignedZeroInfNanPreserveFloat16(shaderSignedZeroInfNanPreserveFloat16);
        shaderSignedZeroInfNanPreserveFloat32(shaderSignedZeroInfNanPreserveFloat32);
        shaderSignedZeroInfNanPreserveFloat64(shaderSignedZeroInfNanPreserveFloat64);
        shaderDenormPreserveFloat16(shaderDenormPreserveFloat16);
        shaderDenormPreserveFloat32(shaderDenormPreserveFloat32);
        shaderDenormPreserveFloat64(shaderDenormPreserveFloat64);
        shaderDenormFlushToZeroFloat16(shaderDenormFlushToZeroFloat16);
        shaderDenormFlushToZeroFloat32(shaderDenormFlushToZeroFloat32);
        shaderDenormFlushToZeroFloat64(shaderDenormFlushToZeroFloat64);
        shaderRoundingModeRTEFloat16(shaderRoundingModeRTEFloat16);
        shaderRoundingModeRTEFloat32(shaderRoundingModeRTEFloat32);
        shaderRoundingModeRTEFloat64(shaderRoundingModeRTEFloat64);
        shaderRoundingModeRTZFloat16(shaderRoundingModeRTZFloat16);
        shaderRoundingModeRTZFloat32(shaderRoundingModeRTZFloat32);
        shaderRoundingModeRTZFloat64(shaderRoundingModeRTZFloat64);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFloatControlsPropertiesKHR set(VkPhysicalDeviceFloatControlsPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR malloc() {
        return wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR calloc() {
        return wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR create(long address) {
        return wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFloatControlsPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFloatControlsPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFloatControlsPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #separateDenormSettings}. */
    public static int nseparateDenormSettings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SEPARATEDENORMSETTINGS); }
    /** Unsafe version of {@link #separateRoundingModeSettings}. */
    public static int nseparateRoundingModeSettings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SEPARATEROUNDINGMODESETTINGS); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat16}. */
    public static int nshaderSignedZeroInfNanPreserveFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat32}. */
    public static int nshaderSignedZeroInfNanPreserveFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat64}. */
    public static int nshaderSignedZeroInfNanPreserveFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat16}. */
    public static int nshaderDenormPreserveFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMPRESERVEFLOAT16); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat32}. */
    public static int nshaderDenormPreserveFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMPRESERVEFLOAT32); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat64}. */
    public static int nshaderDenormPreserveFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMPRESERVEFLOAT64); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat16}. */
    public static int nshaderDenormFlushToZeroFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMFLUSHTOZEROFLOAT16); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat32}. */
    public static int nshaderDenormFlushToZeroFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMFLUSHTOZEROFLOAT32); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat64}. */
    public static int nshaderDenormFlushToZeroFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMFLUSHTOZEROFLOAT64); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat16}. */
    public static int nshaderRoundingModeRTEFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTEFLOAT16); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat32}. */
    public static int nshaderRoundingModeRTEFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTEFLOAT32); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat64}. */
    public static int nshaderRoundingModeRTEFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTEFLOAT64); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat16}. */
    public static int nshaderRoundingModeRTZFloat16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTZFLOAT16); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat32}. */
    public static int nshaderRoundingModeRTZFloat32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTZFLOAT32); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat64}. */
    public static int nshaderRoundingModeRTZFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTZFLOAT64); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFloatControlsPropertiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #separateDenormSettings(boolean) separateDenormSettings}. */
    public static void nseparateDenormSettings(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SEPARATEDENORMSETTINGS, value); }
    /** Unsafe version of {@link #separateRoundingModeSettings(boolean) separateRoundingModeSettings}. */
    public static void nseparateRoundingModeSettings(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SEPARATEROUNDINGMODESETTINGS, value); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat16(boolean) shaderSignedZeroInfNanPreserveFloat16}. */
    public static void nshaderSignedZeroInfNanPreserveFloat16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERSIGNEDZEROINFNANPRESERVEFLOAT16, value); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat32(boolean) shaderSignedZeroInfNanPreserveFloat32}. */
    public static void nshaderSignedZeroInfNanPreserveFloat32(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERSIGNEDZEROINFNANPRESERVEFLOAT32, value); }
    /** Unsafe version of {@link #shaderSignedZeroInfNanPreserveFloat64(boolean) shaderSignedZeroInfNanPreserveFloat64}. */
    public static void nshaderSignedZeroInfNanPreserveFloat64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERSIGNEDZEROINFNANPRESERVEFLOAT64, value); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat16(boolean) shaderDenormPreserveFloat16}. */
    public static void nshaderDenormPreserveFloat16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMPRESERVEFLOAT16, value); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat32(boolean) shaderDenormPreserveFloat32}. */
    public static void nshaderDenormPreserveFloat32(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMPRESERVEFLOAT32, value); }
    /** Unsafe version of {@link #shaderDenormPreserveFloat64(boolean) shaderDenormPreserveFloat64}. */
    public static void nshaderDenormPreserveFloat64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMPRESERVEFLOAT64, value); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat16(boolean) shaderDenormFlushToZeroFloat16}. */
    public static void nshaderDenormFlushToZeroFloat16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMFLUSHTOZEROFLOAT16, value); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat32(boolean) shaderDenormFlushToZeroFloat32}. */
    public static void nshaderDenormFlushToZeroFloat32(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMFLUSHTOZEROFLOAT32, value); }
    /** Unsafe version of {@link #shaderDenormFlushToZeroFloat64(boolean) shaderDenormFlushToZeroFloat64}. */
    public static void nshaderDenormFlushToZeroFloat64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERDENORMFLUSHTOZEROFLOAT64, value); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat16(boolean) shaderRoundingModeRTEFloat16}. */
    public static void nshaderRoundingModeRTEFloat16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTEFLOAT16, value); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat32(boolean) shaderRoundingModeRTEFloat32}. */
    public static void nshaderRoundingModeRTEFloat32(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTEFLOAT32, value); }
    /** Unsafe version of {@link #shaderRoundingModeRTEFloat64(boolean) shaderRoundingModeRTEFloat64}. */
    public static void nshaderRoundingModeRTEFloat64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTEFLOAT64, value); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat16(boolean) shaderRoundingModeRTZFloat16}. */
    public static void nshaderRoundingModeRTZFloat16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTZFLOAT16, value); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat32(boolean) shaderRoundingModeRTZFloat32}. */
    public static void nshaderRoundingModeRTZFloat32(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTZFLOAT32, value); }
    /** Unsafe version of {@link #shaderRoundingModeRTZFloat64(boolean) shaderRoundingModeRTZFloat64}. */
    public static void nshaderRoundingModeRTZFloat64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFloatControlsPropertiesKHR.SHADERROUNDINGMODERTZFLOAT64, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFloatControlsPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFloatControlsPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFloatControlsPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceFloatControlsPropertiesKHR.create(-1L);

        /**
         * Creates a new {@link VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFloatControlsPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFloatControlsPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFloatControlsPropertiesKHR.npNext(address()); }
        /** Returns the value of the {@code separateDenormSettings} field. */
        @NativeType("VkBool32")
        public boolean separateDenormSettings() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nseparateDenormSettings(address()) != 0; }
        /** Returns the value of the {@code separateRoundingModeSettings} field. */
        @NativeType("VkBool32")
        public boolean separateRoundingModeSettings() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nseparateRoundingModeSettings(address()) != 0; }
        /** Returns the value of the {@code shaderSignedZeroInfNanPreserveFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat16() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderSignedZeroInfNanPreserveFloat16(address()) != 0; }
        /** Returns the value of the {@code shaderSignedZeroInfNanPreserveFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat32() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderSignedZeroInfNanPreserveFloat32(address()) != 0; }
        /** Returns the value of the {@code shaderSignedZeroInfNanPreserveFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderSignedZeroInfNanPreserveFloat64() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderSignedZeroInfNanPreserveFloat64(address()) != 0; }
        /** Returns the value of the {@code shaderDenormPreserveFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat16() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormPreserveFloat16(address()) != 0; }
        /** Returns the value of the {@code shaderDenormPreserveFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat32() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormPreserveFloat32(address()) != 0; }
        /** Returns the value of the {@code shaderDenormPreserveFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormPreserveFloat64() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormPreserveFloat64(address()) != 0; }
        /** Returns the value of the {@code shaderDenormFlushToZeroFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat16() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormFlushToZeroFloat16(address()) != 0; }
        /** Returns the value of the {@code shaderDenormFlushToZeroFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat32() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormFlushToZeroFloat32(address()) != 0; }
        /** Returns the value of the {@code shaderDenormFlushToZeroFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderDenormFlushToZeroFloat64() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormFlushToZeroFloat64(address()) != 0; }
        /** Returns the value of the {@code shaderRoundingModeRTEFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat16() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTEFloat16(address()) != 0; }
        /** Returns the value of the {@code shaderRoundingModeRTEFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat32() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTEFloat32(address()) != 0; }
        /** Returns the value of the {@code shaderRoundingModeRTEFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTEFloat64() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTEFloat64(address()) != 0; }
        /** Returns the value of the {@code shaderRoundingModeRTZFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat16() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTZFloat16(address()) != 0; }
        /** Returns the value of the {@code shaderRoundingModeRTZFloat32} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat32() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTZFloat32(address()) != 0; }
        /** Returns the value of the {@code shaderRoundingModeRTZFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderRoundingModeRTZFloat64() { return VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTZFloat64(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFloatControlsPropertiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code separateDenormSettings} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer separateDenormSettings(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nseparateDenormSettings(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code separateRoundingModeSettings} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer separateRoundingModeSettings(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nseparateRoundingModeSettings(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSignedZeroInfNanPreserveFloat16} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderSignedZeroInfNanPreserveFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderSignedZeroInfNanPreserveFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSignedZeroInfNanPreserveFloat32} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderSignedZeroInfNanPreserveFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderSignedZeroInfNanPreserveFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSignedZeroInfNanPreserveFloat64} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderSignedZeroInfNanPreserveFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderSignedZeroInfNanPreserveFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDenormPreserveFloat16} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderDenormPreserveFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormPreserveFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDenormPreserveFloat32} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderDenormPreserveFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormPreserveFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDenormPreserveFloat64} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderDenormPreserveFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormPreserveFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDenormFlushToZeroFloat16} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderDenormFlushToZeroFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormFlushToZeroFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDenormFlushToZeroFloat32} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderDenormFlushToZeroFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormFlushToZeroFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDenormFlushToZeroFloat64} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderDenormFlushToZeroFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderDenormFlushToZeroFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderRoundingModeRTEFloat16} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderRoundingModeRTEFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTEFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderRoundingModeRTEFloat32} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderRoundingModeRTEFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTEFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderRoundingModeRTEFloat64} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderRoundingModeRTEFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTEFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderRoundingModeRTZFloat16} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderRoundingModeRTZFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTZFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderRoundingModeRTZFloat32} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderRoundingModeRTZFloat32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTZFloat32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderRoundingModeRTZFloat64} field. */
        public VkPhysicalDeviceFloatControlsPropertiesKHR.Buffer shaderRoundingModeRTZFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFloatControlsPropertiesKHR.nshaderRoundingModeRTZFloat64(address(), value ? 1 : 0); return this; }

    }

}