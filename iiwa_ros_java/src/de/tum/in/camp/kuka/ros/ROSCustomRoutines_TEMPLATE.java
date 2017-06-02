package de.tum.in.camp.kuka.ros;

import static com.kuka.roboticsAPI.motionModel.BasicMotions.ptp;
import geometry_msgs.PoseStamped;
import iiwa_msgs.CartesianQuantity;
import iiwa_msgs.ConfigureSmartServoRequest;
import iiwa_msgs.ConfigureSmartServoResponse;
import iiwa_msgs.JointQuantity;
import iiwa_msgs.TimeToDestinationRequest;
import iiwa_msgs.TimeToDestinationResponse;

import java.net.URI;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.ros.exception.ServiceException;
import org.ros.node.NodeConfiguration;
import org.ros.node.NodeMainExecutor;
import org.ros.node.service.ServiceResponseBuilder;


import com.kuka.connectivity.motionModel.smartServo.ServoMotion;
import com.kuka.connectivity.motionModel.smartServo.SmartServo;
import com.kuka.roboticsAPI.conditionModel.BooleanIOCondition;
import com.kuka.roboticsAPI.conditionModel.ForceCondition;
import com.kuka.roboticsAPI.conditionModel.ICondition;
import com.kuka.roboticsAPI.controllerModel.Controller;
import com.kuka.roboticsAPI.deviceModel.JointPosition;
import com.kuka.roboticsAPI.deviceModel.LBR;
import com.kuka.roboticsAPI.geometricModel.CartDOF;
import com.kuka.roboticsAPI.geometricModel.Frame;
import com.kuka.roboticsAPI.motionModel.controlModeModel.CartesianImpedanceControlMode;
import com.kuka.roboticsAPI.motionModel.controlModeModel.CartesianSineImpedanceControlMode;
import com.kuka.roboticsAPI.motionModel.controlModeModel.IMotionControlMode;
import com.kuka.roboticsAPI.motionModel.controlModeModel.JointImpedanceControlMode;
import com.kuka.roboticsAPI.motionModel.controlModeModel.PositionControlMode;

import de.tum.in.camp.kuka.ros.ROSBaseApplication;
import de.tum.in.camp.kuka.ros.ROSSmartServo;
import de.tum.in.camp.kuka.ros.iiwaConfiguration;
import de.tum.in.camp.kuka.ros.iiwaMessageGenerator;
import de.tum.in.camp.kuka.ros.iiwaSubscriber;

/**
 * This routine should 'extend' whatever the main RobotApplication was (ROSSmartServo/ROSMonitor/etc.) and
 * be the application running on the controller.
 * 
 * A template for custom add-on modules that can stacked onto the ROSBaseApplication.
 * Useful for implementing ROSSmartServo as a base and being able to update with the iiwa_stack base
 * without having to manually modify a RobotApplication.
 * 
 * This also makes it easier to implement your own publishers/subscribers/messages/configuration .java files
 * without modifying the core iiwa_stack src.  
 * 
 * This routine should 'extend' whatever the main RobotApplication was (ROSSmartServo/ROSMonitor/etc.) and
 * be the application running on the controller.
 * 
 * @author mbanerjee
 * @date   06/02/2017
 *
 */

public class ROSCustomRoutines_TEMPLATE extends ROSSmartServo {
	
	@Override
	protected void custom_InitializeApp() {
		//getLogger().info("custom initialization template fired");
	}
	
	@Override
	protected void custom_BeforeControlLoop() {
		//getLogger().info("custom pre-loop template fired");
	}
	
	@Override
	protected void custom_Loop() {
		//getLogger().info("custom loop template fired");
	}
	
	@Override
	protected void custom_Cleanup() {
		//getLogger().info("custom cleanup template fired");
	}
}
