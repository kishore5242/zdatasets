/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class AgentWithDatasetSch_Schedule_A1E981941F6C1270DDB8B13336663461
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public AgentWithDatasetSch_Schedule_A1E981941F6C1270DDB8B13336663461(IContainer parent, String name) {
		super(parent, name, "A1E981941F6C1270DDB8B13336663461");
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "User Group 1", "A1E981941F7B7BC0DDB8B13336663461");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1E981941F7BA2D6DDB8B13336663461") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.AgentDatasetBasic_Test_A1E9819463BAA4F0DDB8B13336663461(this,
							"A1E98194B331D080DDB8B13336663461") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}