package org.lwjgl.glfw;

import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;

import java.nio.IntBuffer;

/**
 * Created with IntelliJ IDEA.
 * User: Brian Matzon
 * Date: 27-01-13
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */
public class GLFWTest {

    static {
        org.lwjgl.Sys.touch();
    }

    public void versionTest() {
        IntBuffer major = BufferUtils.createIntBuffer(1);
        IntBuffer minor = BufferUtils.createIntBuffer(1);
        IntBuffer rev = BufferUtils.createIntBuffer(1);

        GLFW.glfwInit();
        GLFW.glfwGetVersion(major, minor, rev);
        GLFW.glfwTerminate();

        System.out.println(String.format("Initialized with GLFW version: %d.%d.%d", major.get(), minor.get(), rev.get()));
    }

    public void videoModeTest() {
        GLFW.glfwInit();
        /*glfwSetErrorCallback(new GLFWErrorCallBack() {
            public void errorCallback(int error, String description) {

            }
        });*/

        long primaryMonitor = GLFW.glfwGetPrimaryMonitor();
        String monitorName = GLFW.glfwGetMonitorName(primaryMonitor);
        System.out.println("Primary monitor name: " + monitorName);

        PointerBuffer monitors = GLFW.glfwGetMonitors();
        System.out.println("Monitors: " + monitors.capacity());
        for(int i=0; i<monitors.capacity(); i++) {
            System.out.println("monitor[" + i + "] name: " + GLFW.glfwGetMonitorName(monitors.get(i)));
        }

        /*for(int i=0; i<monitors.capacity(); i++) {
            long monitor = monitors.get(i);
            long mode = GLFW.glfwGetVideoMode(primaryMonitor);
            PointerBuffer modes = GLFW.glfwGetVideoModes(monitor);

            monitorName = GLFW.glfwGetMonitorName(monitor);

            int monitorVirtualPositionX = GLFW.glfwGetMonitorParam(monitor, GLFW_MONITOR_POS_X);
            int monitorVirtualPositionY = GLFW.glfwGetMonitorParam(monitor, GLFW_MONITOR_POS_Y);
            int monitorWidth = GLFW.glfwGetMonitorParam(monitor, GLFW_MONITOR_WIDTH_MM);
            int monitorHeight = GLFW.glfwGetMonitorParam(monitor, GLFW_MONITOR_HEIGHT_MM);
            //int dpi = (int) ((float) mode.width * 25.4f / (float) monitorWidth);

            //String currentVideoMode = String.format("%d x %d x %d (%d %d %d)", mode.width, mode.height, (mode.redBits + mode.greenBits + mode.blueBits), mode.redBits, mode.greenBits, mode.blueBits);

            System.out.println("Name: " + monitorName + "(" + primaryMonitor + ")");
            //System.out.println("Current mode: " + currentVideoMode);
            System.out.println("Virtual Poisition: " + monitorVirtualPositionX + ", " + monitorVirtualPositionY);
            //System.out.println(String.format("Physical size: %d x %d mm (%f dpi)", monitorWidth, monitorHeight, dpi));

            System.out.println("Modes:");
            for(int j=0; j<videoModeCount; j++) {
                System.out.println(String.format("%d x %d x %d (%d %d %d)", mode.width, mode.height, (mode.redBits + mode.greenBits + mode.blueBits), mode.redBits, mode.greenBits, mode.blueBits));
            }
        }
        */
        GLFW.glfwTerminate();
    }

    public static void main(String[] args) {
        GLFWTest test = new GLFWTest();
        test.versionTest();
        test.videoModeTest();
    }

}
