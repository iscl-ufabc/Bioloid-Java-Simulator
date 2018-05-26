

import coppelia.IntW;
import coppelia.remoteApi;

public class Run {
	
	public static double[] matlab(int k){
		int angMat9[]={526,	525,	525,	524,	523,	522,	521,	520,	519,	518,	516,	514,	513,	510,	508,	506,	503,	501,	498,	495,	492,	488,	485,	482,	479,	476,	473,	471,	469,	467,	465,	464,	463,	462,	462,	462,	462,	462,	463,	463,	464,	465,	466,	467,	468,	469,	470,	471,	472,	472,	473,	474,	475,	475,	476,	477,	477,	478,	478,	479,	479,	479,	480,	480,	480,	480,	480,	481,	481,	481,	481,	481,	481,	481,	481,	481,	481,	481,	481,	480,	480,	480,	480,	479,	479,	479,	478,	478,	478,	477,	477,	476,	475,	475,	474,	473,	472,	471,	470,	469,	468,	468,	467,	466,	465,	464,	463,	462,	462,	462,	462,	462,	462,	463,	464,	466,	467,	469,	472,	474,	477,	480,	483,	486,	489,	492,	496,	499,	501,	504,	507,	509,	511,	513,	515,	517,	518,	519,	521,	522,	523,	523,	524,	525,	526,	526,	527,	527,	527,	528,	528,	528,	529,	529,	529,	529,	529,	529,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	531,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	530,	529,	529,	529,	529,	529,	528,	528,	528,	528,	527,	527,	526,	526,	525,	525,	524,	523,	522,	521,	520,	519,	517,	516,	514,	512,	510,	508,	505,	503,	500,	497,	494,	491,	488,	484,	481,	478,	475,	473,	470,	468,	466,	465,	464,	463,	462,	462,	462,	462,	462};
		int angMat10[]={554,	554,	554,	553,	552,	551,	551,	549,	548,	547,	545,	544,	542,	540,	537,	535,	532,	529,	526,	523,	520,	517,	513,	510,	507,	504,	501,	498,	496,	494,	492,	491,	490,	489,	489,	489,	489,	490,	490,	491,	492,	493,	494,	496,	497,	498,	499,	500,	501,	502,	503,	504,	505,	506,	506,	507,	508,	508,	509,	509,	510,	510,	510,	511,	511,	511,	511,	512,	512,	512,	512,	512,	512,	512,	512,	512,	512,	512,	512,	511,	511,	511,	511,	510,	510,	510,	509,	509,	508,	507,	507,	506,	505,	505,	504,	503,	502,	501,	500,	499,	498,	496,	495,	494,	493,	492,	491,	490,	490,	489,	489,	489,	490,	490,	491,	493,	494,	497,	499,	502,	505,	508,	511,	514,	518,	521,	524,	527,	530,	533,	536,	538,	540,	542,	544,	546,	547,	549,	550,	551,	552,	552,	553,	554,	554,	555,	555,	555,	555,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	555,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	556,	555,	555,	555,	554,	554,	553,	553,	552,	551,	550,	549,	548,	547,	545,	543,	541,	539,	537,	534,	532,	529,	526,	522,	519,	516,	512,	509,	506,	503,	500,	498,	495,	493,	492,	491,	490,	489,	489,	489,	489,	490};
		int angMat11[]={397,	397,	397,	397,	397,	397,	397,	397,	396,	396,	396,	395,	395,	394,	393,	392,	391,	390,	389,	388,	387,	385,	384,	383,	382,	381,	379,	379,	378,	377,	376,	376,	376,	376,	376,	376,	376,	377,	377,	378,	378,	379,	379,	380,	381,	381,	382,	382,	383,	383,	384,	384,	385,	385,	385,	386,	386,	386,	387,	387,	387,	387,	387,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	388,	387,	387,	387,	387,	387,	387,	386,	386,	386,	385,	385,	385,	384,	384,	383,	383,	382,	382,	381,	380,	380,	379,	379,	378,	377,	377,	376,	376,	376,	376,	376,	376,	376,	377,	377,	378,	379,	380,	381,	382,	383,	385,	386,	387,	388,	389,	391,	392,	393,	393,	394,	395,	395,	396,	396,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	396,	396,	396,	396,	396,	395,	395,	395,	395,	394,	394,	394,	394,	394,	393,	393,	393,	393,	393,	392,	392,	392,	392,	392,	392,	391,	391,	391,	391,	391,	391,	391,	391,	391,	391,	391,	391,	390,	390,	390,	390,	390,	390,	390,	391,	391,	391,	391,	391,	391,	391,	391,	391,	391,	391,	391,	392,	392,	392,	392,	392,	392,	393,	393,	393,	393,	393,	393,	394,	394,	394,	394,	395,	395,	395,	395,	396,	396,	396,	396,	396,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	397,	396,	396,	396,	395,	394,	394,	393,	392,	391,	390,	389,	388,	386,	385,	384,	383,	381,	380,	379,	378,	378,	377,	376,	376,	376,	376,	376,	376,	376,	377};
		int angMat12[]={658,	659,	659,	660,	660,	660,	661,	661,	661,	661,	661,	661,	661,	661,	661,	660,	660,	659,	659,	658,	657,	656,	655,	654,	653,	652,	652,	651,	650,	649,	648,	647,	646,	645,	645,	644,	644,	643,	643,	643,	642,	642,	642,	642,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	641,	642,	642,	642,	642,	643,	643,	643,	644,	644,	645,	646,	646,	647,	648,	649,	650,	651,	652,	653,	654,	655,	656,	657,	657,	658,	659,	659,	660,	660,	661,	661,	661,	661,	661,	661,	661,	661,	661,	660,	660,	660,	659,	659,	658,	658,	657,	657,	656,	656,	655,	655,	654,	654,	653,	653,	652,	652,	651,	651,	650,	650,	649,	649,	649,	648,	648,	647,	647,	647,	646,	646,	646,	646,	645,	645,	645,	645,	644,	644,	644,	644,	644,	644,	644,	644,	644,	644,	643,	643,	643,	644,	644,	644,	644,	644,	644,	644,	644,	644,	644,	645,	645,	645,	645,	645,	646,	646,	646,	647,	647,	647,	648,	648,	648,	649,	649,	650,	650,	651,	651,	652,	652,	653,	653,	654,	654,	655,	655,	656,	656,	657,	657,	658,	658,	659,	659,	659,	660,	660,	660,	661,	661,	661,	661,	661,	661,	661,	661,	661,	660,	660,	659,	658,	658,	657,	656,	655,	654,	653,	652,	651,	650,	649,	648,	648,	647,	646,	645,	645,	644,	644,	643};
		int angMat13[]={279,	280,	281,	282,	283,	285,	286,	288,	290,	292,	294,	297,	299,	302,	306,	309,	313,	317,	322,	326,	331,	336,	341,	346,	352,	357,	362,	367,	372,	376,	380,	384,	388,	391,	394,	397,	399,	401,	403,	404,	405,	407,	408,	408,	409,	410,	410,	410,	411,	411,	411,	411,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	412,	411,	411,	411,	411,	410,	410,	409,	409,	408,	407,	406,	405,	404,	402,	400,	398,	396,	393,	390,	387,	383,	379,	375,	370,	365,	360,	355,	350,	345,	340,	334,	330,	325,	320,	316,	312,	308,	305,	301,	298,	296,	293,	291,	289,	287,	286,	284,	283,	282,	281,	280,	279,	278,	277,	277,	276,	275,	275,	274,	274,	274,	273,	273,	272,	272,	272,	272,	271,	271,	271,	271,	271,	270,	270,	270,	270,	270,	270,	270,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	269,	270,	270,	270,	270,	270,	270,	270,	271,	271,	271,	271,	271,	272,	272,	272,	273,	273,	273,	274,	274,	275,	275,	276,	276,	277,	278,	278,	279,	280,	281,	282,	284,	285,	287,	288,	290,	292,	295,	297,	300,	303,	306,	310,	314,	318,	323,	327,	332,	337,	342,	348,	353,	358,	363,	368,	373,	377,	381,	385,	389,	392,	395,	397,	399,	401};
		int angMat14[]={661,	664,	666,	669,	672,	676,	679,	682,	686,	690,	694,	698,	703,	708,	713,	718,	723,	729,	735,	741,	747,	753,	759,	765,	770,	776,	781,	785,	789,	793,	796,	798,	800,	801,	802,	802,	802,	802,	801,	800,	799,	797,	796,	794,	793,	791,	790,	788,	787,	786,	784,	783,	782,	781,	780,	779,	779,	778,	777,	777,	776,	776,	775,	775,	775,	774,	774,	774,	774,	774,	774,	774,	774,	774,	774,	774,	774,	774,	774,	774,	775,	775,	775,	776,	776,	776,	777,	778,	778,	779,	780,	781,	782,	783,	784,	785,	786,	787,	789,	790,	792,	793,	795,	796,	798,	799,	800,	801,	802,	802,	802,	802,	801,	799,	797,	795,	792,	788,	784,	779,	774,	769,	763,	757,	751,	745,	739,	733,	727,	722,	716,	711,	706,	701,	697,	693,	689,	685,	681,	678,	675,	671,	668,	665,	663,	660,	657,	655,	652,	650,	648,	645,	643,	641,	639,	637,	635,	633,	631,	630,	628,	626,	625,	623,	622,	620,	619,	618,	616,	615,	614,	613,	612,	611,	610,	609,	609,	608,	607,	607,	606,	606,	605,	605,	604,	604,	604,	604,	604,	604,	604,	604,	604,	604,	604,	604,	604,	605,	605,	605,	606,	606,	607,	608,	608,	609,	610,	611,	612,	613,	614,	615,	616,	617,	618,	620,	621,	622,	624,	626,	627,	629,	631,	632,	634,	636,	638,	640,	642,	644,	647,	649,	651,	654,	656,	659,	661,	664,	667,	670,	673,	676,	680,	683,	687,	691,	695,	699,	704,	709,	714,	719,	725,	730,	736,	742,	748,	754,	760,	766,	772,	777,	782,	786,	790,	793,	796,	799,	800,	801,	802,	802,	802,	801};
		int angMat15[]={628,	627,	626,	625,	624,	622,	620,	618,	616,	614,	611,	608,	604,	601,	596,	592,	587,	582,	576,	570,	564,	558,	551,	545,	539,	532,	526,	520,	515,	510,	505,	501,	497,	494,	491,	489,	487,	486,	485,	484,	483,	483,	483,	483,	483,	483,	483,	483,	484,	484,	484,	485,	485,	485,	486,	486,	486,	487,	487,	487,	487,	487,	488,	488,	488,	488,	488,	488,	488,	488,	488,	489,	489,	489,	489,	488,	488,	488,	488,	488,	488,	488,	488,	488,	487,	487,	487,	487,	486,	486,	486,	486,	485,	485,	485,	484,	484,	483,	483,	483,	483,	483,	483,	483,	483,	483,	484,	485,	486,	488,	490,	492,	495,	498,	502,	507,	511,	517,	522,	528,	534,	541,	547,	553,	560,	566,	572,	578,	583,	589,	593,	598,	602,	606,	609,	612,	615,	617,	619,	621,	623,	624,	625,	627,	628,	628,	629,	630,	630,	631,	631,	632,	632,	632,	633,	633,	633,	633,	633,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	634,	633,	633,	633,	633,	633,	633,	632,	632,	632,	631,	631,	630,	629,	629,	628,	627,	626,	625,	623,	622,	620,	618,	616,	613,	610,	607,	604,	600,	595,	591,	586,	580,	575,	569,	563,	556,	550,	543,	537,	531,	525,	519,	514,	509,	504,	500,	497,	493,	491,	489,	487,	485};
		int angMat16[]={509,	507,	504,	501,	498,	495,	492,	488,	484,	480,	476,	471,	466,	461,	456,	450,	444,	437,	430,	424,	417,	409,	402,	395,	389,	382,	376,	371,	366,	361,	357,	354,	351,	350,	348,	347,	347,	347,	348,	348,	349,	351,	352,	353,	355,	356,	358,	359,	361,	362,	364,	365,	366,	367,	368,	369,	370,	370,	371,	372,	372,	373,	373,	374,	374,	374,	375,	375,	375,	375,	375,	375,	376,	376,	375,	375,	375,	375,	375,	375,	374,	374,	374,	373,	373,	372,	372,	371,	370,	369,	369,	368,	367,	366,	364,	363,	362,	360,	359,	357,	356,	354,	353,	352,	350,	349,	348,	347,	347,	347,	348,	349,	350,	352,	355,	358,	362,	367,	372,	378,	384,	391,	398,	405,	412,	419,	426,	433,	439,	446,	452,	457,	463,	468,	473,	477,	481,	485,	489,	493,	496,	499,	502,	505,	508,	510,	513,	515,	517,	519,	521,	523,	525,	527,	529,	531,	533,	534,	536,	537,	539,	540,	542,	543,	544,	545,	547,	548,	549,	550,	551,	551,	552,	553,	554,	554,	555,	556,	556,	557,	557,	557,	558,	558,	558,	559,	559,	559,	559,	559,	559,	559,	559,	559,	559,	559,	559,	558,	558,	558,	557,	557,	556,	556,	555,	555,	554,	553,	553,	552,	551,	550,	549,	548,	547,	546,	545,	544,	542,	541,	540,	538,	537,	535,	533,	532,	530,	528,	526,	524,	522,	520,	518,	516,	514,	511,	509,	506,	503,	500,	497,	494,	491,	487,	483,	479,	475,	470,	465,	460,	454,	448,	442,	436,	429,	422,	415,	408,	401,	394,	387,	381,	375,	369,	364,	360,	356,	353,	351,	349,	348,	347,	347,	347};
		int angMat17[]={534,	533,	532,	531,	530,	529,	527,	526,	524,	522,	520,	517,	515,	512,	509,	505,	502,	498,	494,	489,	485,	481,	476,	472,	468,	464,	460,	456,	453,	450,	448,	446,	445,	444,	443,	443,	443,	444,	445,	445,	447,	448,	449,	450,	452,	453,	454,	456,	457,	458,	459,	460,	461,	462,	463,	464,	464,	465,	466,	466,	467,	467,	468,	468,	468,	469,	469,	469,	469,	469,	469,	469,	469,	469,	469,	469,	469,	469,	469,	469,	468,	468,	468,	467,	467,	467,	466,	465,	465,	464,	463,	463,	462,	461,	460,	459,	458,	456,	455,	454,	453,	451,	450,	449,	447,	446,	445,	444,	444,	443,	443,	444,	444,	445,	447,	449,	451,	454,	457,	461,	465,	469,	473,	478,	482,	486,	491,	495,	499,	503,	506,	510,	513,	516,	518,	520,	523,	525,	526,	528,	529,	530,	532,	533,	534,	534,	535,	536,	536,	537,	537,	538,	538,	539,	539,	539,	540,	540,	540,	540,	541,	541,	541,	541,	541,	541,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	543,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	542,	541,	541,	541,	541,	541,	541,	540,	540,	540,	539,	539,	539,	538,	538,	538,	537,	537,	536,	535,	535,	534,	533,	532,	531,	530,	528,	527,	525,	523,	521,	519,	517,	514,	511,	508,	504,	501,	497,	493,	488,	484,	480,	475,	471,	467,	463,	459,	456,	453,	450,	448,	446,	445,	444,	443,	443,	444,	444};
		int angMat18[]={564,	563,	562,	561,	560,	559,	557,	556,	554,	552,	550,	548,	545,	543,	540,	536,	533,	529,	525,	521,	517,	513,	508,	504,	500,	496,	493,	489,	486,	484,	482,	480,	478,	478,	477,	477,	477,	477,	478,	479,	480,	481,	482,	483,	485,	486,	487,	488,	490,	491,	492,	493,	494,	495,	495,	496,	497,	498,	498,	499,	499,	500,	500,	500,	501,	501,	501,	501,	501,	502,	502,	502,	502,	502,	502,	502,	502,	501,	501,	501,	501,	501,	500,	500,	499,	499,	499,	498,	497,	497,	496,	495,	494,	494,	493,	492,	490,	489,	488,	487,	486,	484,	483,	482,	481,	480,	479,	478,	477,	477,	477,	477,	478,	479,	480,	482,	485,	487,	490,	494,	498,	501,	506,	510,	514,	518,	522,	526,	530,	534,	537,	540,	543,	546,	549,	551,	553,	555,	556,	558,	559,	560,	562,	563,	563,	564,	565,	566,	566,	567,	567,	568,	568,	568,	569,	569,	569,	570,	570,	570,	570,	571,	571,	571,	571,	571,	571,	571,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	572,	571,	571,	571,	571,	571,	571,	570,	570,	570,	570,	570,	569,	569,	569,	568,	568,	567,	567,	566,	566,	565,	565,	564,	563,	562,	561,	560,	559,	557,	556,	554,	552,	550,	547,	545,	542,	539,	535,	532,	528,	524,	520,	516,	512,	507,	503,	499,	495,	492,	489,	486,	483,	481,	479,	478,	477,	477,	477,	477,	478};
																																																																																																																																																																																																																																																																												
		double[] v = {334,690,298,724,412,611,355,664,angMat9[k],angMat10[k],angMat11[k],angMat12[k],angMat13[k],angMat14[k],angMat15[k],angMat16[k],angMat17[k],angMat18[k]};
		
		return v; 
	}
	
	public static void main(String[] args){
		
		//Getting access VREP's libraries ------------------------------------------------------------------
        remoteApi vrep = new remoteApi();
		//--------------------------------------------------------------------------------------------------
			
		//Creating a Java Connection with VREP -------------------------------------------------------------
		int clientID = vrep.simxStart("127.0.0.1",19999,true,true,5000,5);
		//--------------------------------------------------------------------------------------------------
		
		//Creating vector of angles of the motors ----------------------------------------------------------
		double degrees[] = new double[18];
		//--------------------------------------------------------------------------------------------------
		
		
		// Setting ID of motors ----------------------------------------------------------------------------		
		IntW id1 = new IntW(1);	IntW id2 = new IntW(1);	IntW id3 = new IntW(1);	IntW id4 = new IntW(1);
		IntW id5 = new IntW(1);	IntW id6 = new IntW(1);	IntW id7 = new IntW(1);	IntW id8 = new IntW(1);
		IntW id9 = new IntW(1);	IntW id10 = new IntW(1);IntW id11 = new IntW(1);IntW id12 = new IntW(1);
		IntW id13 = new IntW(1);IntW id14 = new IntW(1);IntW id15 = new IntW(1);IntW id16 = new IntW(1);
		IntW id17 = new IntW(1);IntW id18 = new IntW(1);IntW robo = new IntW(1);IntW chao = new IntW(1);
		//--------------------------------------------------------------------------------------------------
		
		
		Bioloid func = new Bioloid(vrep,clientID,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,id16,id17,id18,robo,chao);
		func.techCheck();
		
		func.clear(5000,degrees);
		func.initialPos(15000,degrees);

		func.readCM(); 
		func.readCM();
		
        degrees[0]= 333.5; // motor 1 degree
        degrees[1]= 690; // motor 2 degree
        degrees[2]= 297.8; // motor 3 degree
        degrees[3]= 724; // motor 4 degree
        degrees[4]= 412; // motor 5 degree
        degrees[5]= 611.2; // motor 6 degree
        degrees[6]= 355; // motor 7 degree
        degrees[7]= 664; // motor 8 degree
		
		int k = 0;
		while (true){
			for (int t = k;t<274;t = t + 1){
				func.setDegrees(400,matlab(t)); //	,degrees);
				//func.readMotors();
				func.readCM();
			}
			k = 29;
		}
	}
}

/*
 Developed By:
 Gilmar Correia Jeronimo - e-mail: gilmar.correia@aluno.ufabc.edu.br
 Federal University of ABC - Brazil 
 2016
 */