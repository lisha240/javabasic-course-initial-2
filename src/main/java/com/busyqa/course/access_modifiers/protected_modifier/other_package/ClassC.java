package com.busyqa.course.access_modifiers.protected_modifier.other_package;

import com.busyqa.course.access_modifiers.protected_modifier.same_package.ClassA;


class ClassD extends ClassA{

	/* 
	 * The members inherited from classA are available in other packages through 
	 * inheritance only.
	 * 
	 */
	void verifyVisibility() {

	}
}

class ClassC {

}
