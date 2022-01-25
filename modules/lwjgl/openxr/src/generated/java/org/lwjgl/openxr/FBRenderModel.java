/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The FB_render_model extension. */
public class FBRenderModel {

    /** The extension specification version. */
    public static final int XR_FB_render_model_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_RENDER_MODEL_EXTENSION_NAME = "XR_FB_render_model";

    /** XR_MAX_RENDER_MODEL_NAME_SIZE_FB */
    public static final int XR_MAX_RENDER_MODEL_NAME_SIZE_FB = 64;

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_RENDER_MODEL_PATH_INFO_FB TYPE_RENDER_MODEL_PATH_INFO_FB}</li>
     * <li>{@link #XR_TYPE_RENDER_MODEL_PROPERTIES_FB TYPE_RENDER_MODEL_PROPERTIES_FB}</li>
     * <li>{@link #XR_TYPE_RENDER_MODEL_BUFFER_FB TYPE_RENDER_MODEL_BUFFER_FB}</li>
     * <li>{@link #XR_TYPE_RENDER_MODEL_LOAD_INFO_FB TYPE_RENDER_MODEL_LOAD_INFO_FB}</li>
     * <li>{@link #XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_RENDER_MODEL_PATH_INFO_FB         = 1000119000,
        XR_TYPE_RENDER_MODEL_PROPERTIES_FB        = 1000119001,
        XR_TYPE_RENDER_MODEL_BUFFER_FB            = 1000119002,
        XR_TYPE_RENDER_MODEL_LOAD_INFO_FB         = 1000119003,
        XR_TYPE_SYSTEM_RENDER_MODEL_PROPERTIES_FB = 1000119004;

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_RENDER_MODEL_KEY_INVALID_FB ERROR_RENDER_MODEL_KEY_INVALID_FB}</li>
     * <li>{@link #XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_RENDER_MODEL_KEY_INVALID_FB = -1000119000,
        XR_RENDER_MODEL_UNAVAILABLE_FB       = 1000119020;

    /** API Constants */
    public static final long XR_NULL_RENDER_MODEL_KEY_FB = 0x0L;

    protected FBRenderModel() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateRenderModelPathsFB ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB}
     *
     * @param pathCapacityInput the capacity of the {@code paths}, or 0 to retrieve the required capacity.
     */
    public static int nxrEnumerateRenderModelPathsFB(XrSession session, int pathCapacityInput, long pathCountOutput, long paths) {
        long __functionAddress = session.getCapabilities().xrEnumerateRenderModelPathsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), pathCapacityInput, pathCountOutput, paths, __functionAddress);
    }

    /**
     * Enumerate supported render model paths.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateRenderModelPathsFB(
     *     XrSession                                   session,
     *     uint32_t                                    pathCapacityInput,
     *     uint32_t*                                   pathCountOutput,
     *     XrRenderModelPathInfoFB*                    paths);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The application <b>must</b> call {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB} to enumerate the valid render model paths that are supported by the runtime before calling {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}. The paths returned <b>may</b> be used later in {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code pathCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code pathCapacityInput} is not 0, {@code paths} <b>must</b> be a pointer to an array of {@code pathCapacityInput} {@link XrRenderModelPathInfoFB} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrRenderModelPathInfoFB}</p>
     *
     * @param session         the specified {@code XrSession}.
     * @param pathCountOutput a pointer to the count of {@code float} {@code paths} written, or a pointer to the required capacity in the case that {@code pathCapacityInput} is 0.
     * @param paths           a pointer to an application-allocated array that will be filled with {@link XrRenderModelPathInfoFB} values that are supported by the runtime, but <b>can</b> be {@code NULL} if {@code pathCapacityInput} is 0
     */
    @NativeType("XrResult")
    public static int xrEnumerateRenderModelPathsFB(XrSession session, @NativeType("uint32_t *") IntBuffer pathCountOutput, @Nullable @NativeType("XrRenderModelPathInfoFB *") XrRenderModelPathInfoFB.Buffer paths) {
        if (CHECKS) {
            check(pathCountOutput, 1);
        }
        return nxrEnumerateRenderModelPathsFB(session, remainingSafe(paths), memAddress(pathCountOutput), memAddressSafe(paths));
    }

    // --- [ xrGetRenderModelPropertiesFB ] ---

    /** Unsafe version of: {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} */
    public static int nxrGetRenderModelPropertiesFB(XrSession session, long path, long properties) {
        long __functionAddress = session.getCapabilities().xrGetRenderModelPropertiesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), path, properties, __functionAddress);
    }

    /**
     * Get information for a render model.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrGetRenderModelPropertiesFB(
     *     XrSession                                   session,
     *     XrPath                                      path,
     *     XrRenderModelPropertiesFB*                  properties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} is used for getting information for a render model using a path retrieved from {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB}. The information returned will be for the connected device that corresponds to the path given. For example, using pathname:/model_fb/controller/left will return information for the left controller that is currently connected and will change if a different device that also represents a left controller is connected.</p>
     * 
     * <p>The runtime <b>must</b> return {@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID} if {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} is called with render model paths before calling {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB}. The runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID} if a path not given by {@link #xrEnumerateRenderModelPathsFB EnumerateRenderModelPathsFB} is used.</p>
     * 
     * <p>If {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} returns a success code of {@link #XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB} and has a {@code modelKey} of {@link #XR_NULL_RENDER_MODEL_KEY_FB NULL_RENDER_MODEL_KEY_FB}, this indicates that the model for the device is unavailable. The application <b>may</b> keep calling {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB} because the model <b>may</b> become available later when a device is connected.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to calling {@link #xrGetRenderModelPropertiesFB GetRenderModelPropertiesFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code properties} <b>must</b> be a pointer to an {@link XrRenderModelPropertiesFB} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_CALL_ORDER_INVALID ERROR_CALL_ORDER_INVALID}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrRenderModelPropertiesFB}</p>
     *
     * @param session    the specified {@code XrSession}.
     * @param path       the path of the render model to get the properties for.
     * @param properties a pointer to the {@link XrRenderModelPropertiesFB} to write the render model information to.
     */
    @NativeType("XrResult")
    public static int xrGetRenderModelPropertiesFB(XrSession session, @NativeType("XrPath") long path, @NativeType("XrRenderModelPropertiesFB *") XrRenderModelPropertiesFB properties) {
        return nxrGetRenderModelPropertiesFB(session, path, properties.address());
    }

    // --- [ xrLoadRenderModelFB ] ---

    /** Unsafe version of: {@link #xrLoadRenderModelFB LoadRenderModelFB} */
    public static int nxrLoadRenderModelFB(XrSession session, long info, long buffer) {
        long __functionAddress = session.getCapabilities().xrLoadRenderModelFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, buffer, __functionAddress);
    }

    /**
     * Load binary data for a render model.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrLoadRenderModelFB LoadRenderModelFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrLoadRenderModelFB(
     *     XrSession                                   session,
     *     const XrRenderModelLoadInfoFB*              info,
     *     XrRenderModelBufferFB*                      buffer);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #xrLoadRenderModelFB LoadRenderModelFB} is used to load the GLTF model data using a valid {@code modelKey}. {@link #xrLoadRenderModelFB LoadRenderModelFB} loads the model as a byte buffer containing the GLTF in the binary format (GLB). The GLB data <b>must</b> conform to the glTF 2.0 format defined at <a target="_blank" href="https://github.com/KhronosGroup/glTF/tree/master/specification/2.0">https://github.com/KhronosGroup/glTF/tree/master/specification/2.0</a>. The GLB <b>may</b> contain texture data in a format that requires the use of the {@code KHR_texture_basisu} GLTF extension defined at <a target="_blank" href="https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_texture_basisu">https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_texture_basisu</a>. Therefore, the application <b>should</b> ensure it can handle this extension.</p>
     * 
     * <p>If the device for the requested model is disconnected or does not match the {@code modelKey} provided, {@link #xrLoadRenderModelFB LoadRenderModelFB} <b>must</b> return {@link #XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB} as well as a {@code bufferCountOutput} value of 0 indicating that the model was not available.</p>
     * 
     * <p>The {@link #xrLoadRenderModelFB LoadRenderModelFB} function <b>may</b> be slow, therefore applications <b>should</b> call it from a non-time sensitive thread.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBRenderModel XR_FB_render_model} extension <b>must</b> be enabled prior to calling {@link #xrLoadRenderModelFB LoadRenderModelFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code info} <b>must</b> be a pointer to a valid {@link XrRenderModelLoadInfoFB} structure</li>
     * <li>{@code buffer} <b>must</b> be a pointer to an {@link XrRenderModelBufferFB} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * <li>{@link #XR_RENDER_MODEL_UNAVAILABLE_FB RENDER_MODEL_UNAVAILABLE_FB}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link #XR_ERROR_RENDER_MODEL_KEY_INVALID_FB ERROR_RENDER_MODEL_KEY_INVALID_FB}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrRenderModelBufferFB}, {@link XrRenderModelLoadInfoFB}</p>
     *
     * @param session the specified {@code XrSession}.
     * @param info    a pointer to the {@link XrRenderModelLoadInfoFB} structure.
     * @param buffer  a pointer to the {@link XrRenderModelBufferFB} structure to write the binary data into.
     */
    @NativeType("XrResult")
    public static int xrLoadRenderModelFB(XrSession session, @NativeType("XrRenderModelLoadInfoFB const *") XrRenderModelLoadInfoFB info, @NativeType("XrRenderModelBufferFB *") XrRenderModelBufferFB buffer) {
        return nxrLoadRenderModelFB(session, info.address(), buffer.address());
    }

}