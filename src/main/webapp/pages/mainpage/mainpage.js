Application.$controller("mainpagePageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };

}]);




Application.$controller("ClientsTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("ClientsLiveForm1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("UsersTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("UsersLiveForm1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("RolesTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("WorkstatusTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);



Application.$controller("ProjectsTable2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("ProjectsLiveForm2Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        $scope.workstatusChange = function($event, $isolateScope, newVal, oldVal) {
            if ($Scope.Widgets.ProjectsLiveForm2.dataoutput.workstatus.id === 4) {
                Widgets.ProjectsLiveForm2.dataoutput.prepareddate = Variables.todaysDate_var.dataSet[$i].datetoday;
            }
            if ($Scope.Widgets.ProjectsLiveForm2.dataoutput.workstatus.id === 5) {
                Widgets.ProjectsLiveForm2.dataoutput.revieweddate = Variables.todaysDate_var.dataSet[$i].datetoday;
            }
            if ($Scope.Widgets.ProjectsLiveForm2.dataoutput.workstatus.id === 8) {
                Widgets.ProjectsLiveForm2.dataoutput.completeddate = Variables.todaysDate_var.dataSet[$i].datetoday;
            }
        };

    }
]);

Application.$controller("OfficesTable1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);